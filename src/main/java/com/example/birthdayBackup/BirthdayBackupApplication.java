package com.example.birthdayBackup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.birthdayBackup.infrastructure.mapper")
public class BirthdayBackupApplication {

	public static void main(String[] args) {
		SpringApplication.run(BirthdayBackupApplication.class, args);
	}

}
