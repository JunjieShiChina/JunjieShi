package me.shijunjie.SimpleEurekaServer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//@PropertySource("classpath:application.yml")
public class BootStrap {
	public static void main(String[] args) {
		String profile = args[0];
		new SpringApplicationBuilder(BootStrap.class).profiles(profile).run(args);
	}
}
