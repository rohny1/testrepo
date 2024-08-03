package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static String reverseWords(String sentence) {
		StringBuilder result = new StringBuilder();
		for (String word : sentence.split("\\s+")) {
			result.append(new StringBuilder(word).reverse()).append(" ");
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		String sentence = "reverse string without changing position";
		String reversedSentence = reverseWords(sentence);
		System.out.println(reversedSentence);
	}
	public static String rverseString(String line){
		StringBuilder stringreverse = new StringBuilder();
		for(String ord : line.split("\\s+")){
			stringreverse.append(new StringBuilder(ord)).append("");
		}
		return stringreverse.toString().trim();
	}
}
