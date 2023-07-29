package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// 프로젝트 생성
		// com.example.coffee
		// coffee.html 만들기 - 주소 : /coffee
		// CoffeeController 를 만들어 coffee.html에 연결
		// 아메리카노 출력
	}

}
