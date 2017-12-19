package com.example.springbthyme;

import com.example.springbthyme.entity.ConfigBean;
import com.example.springbthyme.entity.DBConfigBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class, DBConfigBean.class})
public class SpringbthymeApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringbthymeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbthymeApplication.class, args);
	}
}
