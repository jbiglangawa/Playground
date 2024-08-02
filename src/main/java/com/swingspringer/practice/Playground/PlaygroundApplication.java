package com.swingspringer.practice.Playground;

import com.swingspringer.practice.Playground.algorithms.AlgorithmFactoryRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);
//		var runner = new AlgorithmFactoryRunner();
//		runner.run();
	}

}
