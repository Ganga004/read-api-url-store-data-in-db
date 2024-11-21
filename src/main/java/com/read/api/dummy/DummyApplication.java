package com.read.api.dummy;

import com.read.api.dummy.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyApplication {

	@Autowired
	private DataRepository dataRepository;

	public static void main(String[] args) {
		SpringApplication.run(DummyApplication.class, args);
	}

}