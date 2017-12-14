package com.example.springbthyme;

import com.example.springbthyme.entity.DBConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({DBConfigBean.class})
public class SpringbthymeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbthymeApplication.class, args);
	}
}
