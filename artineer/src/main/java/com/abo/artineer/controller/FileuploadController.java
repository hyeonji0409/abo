package com.abo.artineer.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileuploadController {

	// 파일 업로드 처리
	@RequestMapping("/fileUploadMultiple")
	public String fileUploadMultiple(@RequestParam("uploadFileMulti") ArrayList<MultipartFile> files, Model model)
			throws IOException {

		String savedFileName = "";

		// 파일 저장 경로 설정 : 실제 서비스 되는 위치
		String uploadPath = "D:/FullStackc_Study/artineer_pj/abo/upload/";

		// 여러 개의 파일 이름 저장할 리스트 생성
		ArrayList<String> originalFilenameList = new ArrayList<String>();

		for (MultipartFile file : files) {
			// 원본 파일 이름 알아오기
			String originalFileName = file.getOriginalFilename();

			// 파일 이름 리스트 추가
			originalFilenameList.add(originalFileName);

			// 파일 이름 중복되지 않게 이름 변경
			UUID uuid = UUID.randomUUID();
			savedFileName = uuid.toString() + "_" + originalFileName;

			// 파일 생성
			File file1 = new File(uploadPath + savedFileName);

			// 서버 전송
			file.transferTo(file1);
		}

		model.addAttribute("originalFilenameList", originalFilenameList);

		return "upload/fileUploadMultipleResult";

	}

	// 파일명 바꾸지 않고 그대로 업로드
	@RequestMapping("/fileOriginalNameUpload")
	public String fileOriginalNameUpload(@RequestParam("profile") MultipartFile file, Model model)
			throws IOException {

		// 1. 파일 저장 경로 설정 : 실제 서비스되는 위치 (프로젝트 외부에 저장)
		String uploadPath = "D:/Full_Stackc_Study/spring_study/upload/";

		// 2. 원본 파일 이름 알아오기
		String originalFileName = file.getOriginalFilename();

		// 3. 파일 생성
		File file1 = new File(uploadPath + originalFileName);

		// 4. 서버로 전송
		file.transferTo(file1);

		// model로 저장
		model.addAttribute("originalFileName", originalFileName);

		return "upload/fileUploadResult";
	}

	// 파일 다운로드 처리
	@RequestMapping("/fileDownload/{file}")
	public void fileDownload(@PathVariable String file, HttpServletResponse response) throws IOException {
		File f = new File("D:/Full_Stackc_Study/spring_study/upload", file);

		// file 다운로드 설정
		response.setContentType("application/download");
		response.setContentLength((int) f.length());
		response.setHeader("Content-Disposition", "attatchment;filename=\"" + file + "\"");

		// response 객체를 통해서 서버로부터 파일 다운로드
		OutputStream os = response.getOutputStream();

		// file 입력 객체 생성
		FileInputStream fis = new FileInputStream(f);
		FileCopyUtils.copy(fis, os);

		fis.close();
		os.close();
	}
}
