package com.example.phonebook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.HashSet;

@SpringBootApplication
public class PhonebookApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}

	public static HashMap phonebook;
	public static HashMap phonebook2;

	@Override
	public void run(String... args) throws Exception {
		phonebook = new HashMap<Integer, Phone>();
		phonebook2 = new HashMap<Integer, Phone>();
		for (int i = 0; i < 1000000; i++){
			Phone phone = new Phone(i, "Linh", "213123"+i);
			phonebook.put(String.format("%08d" , i), phone);
		}
		phonebook2.put(String.format(("%08d"), 4), new Phone(4, "Linh", "123123"));
		System.out.println("Init done");
	}
}
