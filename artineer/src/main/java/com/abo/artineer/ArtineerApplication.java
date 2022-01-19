package com.abo.artineer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.abo.artineer.controller.HomeController;
import com.abo.artineer.dao.INoticeDAO;
import com.abo.artineer.service.NoticeService;

@SpringBootApplication
//컨트롤러 빈 추가
@ComponentScan(basePackageClasses = HomeController.class)
@ComponentScan(basePackageClasses = NoticeService.class)
@MapperScan(basePackageClasses = INoticeDAO.class)
public class ArtineerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtineerApplication.class, args);
	}

}
