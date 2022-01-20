package com.abo.artineer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class MailService implements IMailService{
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    @Async
    public void sendMail(String strTo) {
        String to = strTo;
        try {
            // 텍스트로 구성된 메일을 생성할때
            SimpleMailMessage simpleMessage = new SimpleMailMessage();
            // 인증키 6자리 랜덤으로 생성 후 초기화
            String authKey = Integer.toString( ThreadLocalRandom.current().nextInt(100000, 1000000) );
            // 받는사람 설정
            simpleMessage.setTo( to );
            // 제목
            simpleMessage.setSubject("[메일 인증] Artineer에서 인증번호를 보냈습니다.");
            // 메일 내용
            simpleMessage.setText("인증번호는 " + authKey + " 입니다.\n정확하게 입력해주세요.");
            System.out.println(javaMailSender);
            // 메일 발송
            javaMailSender.send(simpleMessage);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }
}
