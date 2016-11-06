package com.customer;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@EnableCaching
public class SpringCustomerRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCustomerRestServiceApplication.class, args);
	}
}
