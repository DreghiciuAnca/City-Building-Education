package com.Dreghiciu.Iteration2;

import com.Dreghiciu.Iteration2.client.ClientGui;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Iteration2Application {

	public static void main(String[] args) {
		SpringApplication.run(Iteration2Application.class, args);
		ClientGui clientGui = new ClientGui();
	}

}

