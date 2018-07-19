package com.chuan.springcloudcumsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudCumsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudCumsumerApplication.class, args);
	}

}
