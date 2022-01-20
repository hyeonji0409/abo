package com.abo.artineer;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.abo.artineer.controller.MemberController;
import com.abo.artineer.controller.HomeController;
import com.abo.artineer.controller.ProjectController;
import com.abo.artineer.controller.ReferenceController;
import com.abo.artineer.dao.IMemberDAO;
import com.abo.artineer.dao.INoticeDAO;
import com.abo.artineer.dao.IProjectDAO;
import com.abo.artineer.dao.IReferenceDAO;
import com.abo.artineer.service.NoticeService;

@SpringBootApplication

@ComponentScan(basePackages = {"com.abo.artineer.service"})
@ComponentScan(basePackageClasses = HomeController.class)
@ComponentScan(basePackageClasses = MemberController.class)
@MapperScan(basePackageClasses = IMemberDAO.class)
@ComponentScan(basePackageClasses = NoticeService.class)
@MapperScan(basePackageClasses = INoticeDAO.class)
@ComponentScan(basePackageClasses = ProjectController.class)
@MapperScan(basePackageClasses = IProjectDAO.class)
@ComponentScan(basePackageClasses = ReferenceController.class)
@MapperScan(basePackageClasses = IReferenceDAO.class)

public class ArtineerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtineerApplication.class, args);
	}

}
