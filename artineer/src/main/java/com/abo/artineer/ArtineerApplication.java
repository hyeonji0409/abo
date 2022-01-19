package com.abo.artineer;


import com.abo.artineer.controller.MemberController;
import com.abo.artineer.dao.IMemberDAO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.abo.artineer.controller.HomeController;
import com.abo.artineer.dao.INoticeDAO;
import com.abo.artineer.service.NoticeService;
import com.abo.artineer.controller.ProjectController;
import com.abo.artineer.dao.IProjectDAO;

@SpringBootApplication

@ComponentScan(basePackages = {"com.abo.artineer.service"})
@ComponentScan(basePackageClasses = HomeController.class)
@ComponentScan(basePackageClasses = MemberController.class)
@MapperScan(basePackageClasses = IMemberDAO.class)
@ComponentScan(basePackageClasses = NoticeService.class)
@MapperScan(basePackageClasses = INoticeDAO.class)
@ComponentScan(basePackageClasses = ProjectController.class)
@MapperScan(basePackageClasses = IProjectDAO.class)

public class ArtineerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtineerApplication.class, args);
	}

}
