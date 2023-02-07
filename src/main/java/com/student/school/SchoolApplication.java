package com.student.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.client.RestTemplate;

import com.student.school.global.WatchServices;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients
//@PropertySources({
//    @PropertySource(value="file:D:\\School\\school.properties", ignoreResourceNotFound=true)
//})
//@ConfigurationProperties
//@PropertySource("file:D:/School/school.properties")
public class SchoolApplication extends SpringBootServletInitializer{

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SchoolApplication.class, args);
//		Path dir = Paths.get("D:/School/school.properties");
//        new WatchServices(dir).processEvents();
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemp(RestTemplateBuilder builder) {

//		return new RestTemplate();
		return builder.build();
	}

}
