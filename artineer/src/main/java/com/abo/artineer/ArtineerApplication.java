package com.abo.artineer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.abo.artineer.controller.HomeController;
import com.abo.artineer.controller.ProjectController;
import com.abo.artineer.dao.IProjectDAO;

@SpringBootApplication
@ComponentScan(basePackageClasses = HomeController.class)
@ComponentScan(basePackageClasses = ProjectController.class)
@ComponentScan(basePackages = {"com.abo.artineer.service"})
@MapperScan(basePackageClasses = IProjectDAO.class)
public class ArtineerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtineerApplication.class, args);
	}

}
