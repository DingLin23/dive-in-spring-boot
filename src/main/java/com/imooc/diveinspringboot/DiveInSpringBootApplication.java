package com.imooc.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.imooc.diveinspringboot.web")
public class DiveInSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiveInSpringBootApplication.class, args);
	}

}


