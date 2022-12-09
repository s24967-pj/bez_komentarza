package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {
	private final CarService carService;

	public DemoApplication(CarService carService) {
		this.carService = carService;

		RentalInfo rentalInfo = carService.rentCar(new User("Basia"), "aaabbbcccddd", LocalDate.of(2022, 11, 22), LocalDate.of(2022, 11, 25));
		System.out.println(rentalInfo);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
