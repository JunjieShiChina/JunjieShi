package me.shijunjie.SimpleEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//@PropertySource("classpath:application.yml")
public class BootStrap {
	public static void main(String[] args) {
		SpringApplication.run(BootStrap.class, args);
	}
}
