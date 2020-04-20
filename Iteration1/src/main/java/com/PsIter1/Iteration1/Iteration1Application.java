package com.PsIter1.Iteration1;

import com.PsIter1.Iteration1.View.Gui;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.awt.*;

@SpringBootApplication
public class Iteration1Application {

	public static void main(String[] args) {

		Gui nouGui = new Gui();
		SpringApplication.run(Iteration1Application.class, args);

	}

}
