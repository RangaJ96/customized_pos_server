package com.agrosb.customizedpos;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class CustomizedPosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomizedPosApplication.class, args);
	}

}
