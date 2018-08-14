package com.eureka.client.clientone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.eureka.client.clientone.dao")
public class ClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientOneApplication.class, args);
	}
}
