package com.example.shopexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;


@EnableKafka
@SpringBootApplication
public class ShopExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopExampleApplication.class, args);
	}

}
