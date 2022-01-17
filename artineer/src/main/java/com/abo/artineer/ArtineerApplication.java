package com.abo.artineer;

import com.abo.artineer.controller.MemberController;
import com.abo.artineer.dao.IMemberDAO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.abo.artineer.controller.HomeController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.abo.artineer.service"})
//컨트롤러 빈 추가
@ComponentScan(basePackageClasses = HomeController.class)
@ComponentScan(basePackageClasses = MemberController.class)

// mapper 빈 추가
@MapperScan(basePackageClasses = IMemberDAO.class)

public class ArtineerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtineerApplication.class, args);
	}

}
