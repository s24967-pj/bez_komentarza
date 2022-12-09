package com.example.demo;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

@Component
public class CarService {
    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;

    CarService(CarStorage carStorage, RentalStorage rentalStorage) {
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }

    public List<Car> getAllCars() {
        return carStorage.getCars();
    }

    public List<Rental> getAllRentals() {
        return rentalStorage.getRentalList();
    }

    public RentalInfo rentCar(User user, String vin, LocalDate startDate, LocalDate endDate) {
        for (Car car : getAllCars()) {
            if (car.getVin().equals(vin)) {
                for (Rental rental : getAllRentals()) {
                    if (rental.getCar().getVin().equals(vin)) {

                        System.out.println("juz wynajety");
                    } else {
                        System.out.println("Success");
                        rentalStorage.getRentalList().add(new Rental(user, car));
                        int x; //wspolczynnik typu pojazdu
                        switch(car.getCarType()){
                            case PREMIUM -> x=3;
                            case STANDARD -> x=2;
                            default -> x=1;

                        }
                        return new RentalInfo(100*DAYS.between(startDate,endDate)*x,startDate,endDate);
                    }
                }

            }


        }
        return null;
    }
}