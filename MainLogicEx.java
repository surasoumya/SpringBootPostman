package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) //@component scan,@enableautoconfig
public class MainLogicEx {
	
	public static void main(String[] args) {
		
		SpringApplication.run(MainLogicEx.class, args);
		
	}

}
