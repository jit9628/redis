package com.cache.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@EnableAutoConfiguration
public class RedisApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder createSpringApplicationBuilder(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(RedisApplication.class);
		// return new SpringApplicationBuilder();
	}
	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
		System.out.println("Testing Redis Srver .. ");
	}

}
