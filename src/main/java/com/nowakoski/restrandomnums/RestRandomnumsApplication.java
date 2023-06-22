package com.nowakoski.restrandomnums;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestRandomnumsApplication {

@RequestMapping("/")
    String home() {
		Random rand = new Random();
		Integer rand_int1 = rand.nextInt(1000);
		StringBuilder builder = new StringBuilder();
		builder.append("RND=");
		builder.append(rand_int1);
		System.out.println(builder.toString());
        return "Random number is: ".concat(rand_int1.toString());
    }

	public static void main(String[] args) {
		SpringApplication.run(RestRandomnumsApplication.class, args);
	}

}
