package com.abo.artineer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.abo.artineer.controller.HomeController;

@SpringBootApplication
//컨트롤러 빈 추가
@ComponentScan(basePackageClasses = HomeController.class)
public class ArtineerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtineerApplication.class, args);
	}

}
