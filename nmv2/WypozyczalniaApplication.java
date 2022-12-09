package com.s24740.wypozyczalnia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class WypozyczalniaApplication {
	private final CarService carService;

	public WypozyczalniaApplication(CarService carService) {
		this.carService = carService;

		//normalne testy
		carService.rentCar(new User ("Kamil"), "2A4RR5D17AR386995", LocalDate.of(2022,10,10), LocalDate.of(2022,10,17));
		carService.rentCar(new User ("Daria"), "SALWG2WFXEA350484", LocalDate.of(2022,10,12), LocalDate.of(2022,10,24));

		//vin jest nullem
		carService.rentCar(new User ("Maciek"), null, LocalDate.of(2022,11,07), LocalDate.of(2022,11,18));

		//startDate jest pozniej niz endDate
		carService.rentCar(new User ("Daniel"), "YV1RH527452477110", LocalDate.of(2022,12,24), LocalDate.of(2022,12,06));

		//auto juz zostalo wypozyczone
		carService.rentCar(new User ("Julia"), "SALWG2WFXEA350484", LocalDate.of(2022,12,12), LocalDate.of(2022,12,27));

		//jaka jest cena wynajmu PREMIUM
		System.out.println("Wynajem auta PREMIUM: " + carService.getPremiumPrice());

		//jaka jest cena wynajmu STANDARD
		System.out.println("Wynajem auta STANDARD: " + carService.getStardardPrice());
	}

	public static void main(String[] args) {
		SpringApplication.run(WypozyczalniaApplication.class, args);
	}

}
