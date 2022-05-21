package com.onursevinc.dev.sshWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author OnurSevinc
 * @version 0.1
 * @date 16.04.2022
 * @time 18:15
 */
@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SshWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SshWsApplication.class, args);
	}

}
