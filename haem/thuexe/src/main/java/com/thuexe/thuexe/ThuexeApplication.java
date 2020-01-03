package com.thuexe.thuexe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ThuexeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThuexeApplication.class, args);
	}

}
