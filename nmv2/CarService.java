package com.s24740.wypozyczalnia;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Component
public class CarService {
    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;
    private double stardardPrice = 200;
    private double premiumPrice = 400;
    private double exclusivePrice = 600;
    private double bossPrice = 1000;

    public CarService(CarStorage carStorage, RentalStorage rentalStorage) {
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }

    public RentalInfo rentCar(User user, String vin, LocalDate startDate, LocalDate endDate){
        if(carStorage.getSamochodList().isEmpty() == false) {
            if (carStorage.checkIfVin(vin) != null) {
                //auto o danym vin istnieje
                if (rentalStorage.checkIfRentalVin(vin) == true) {
                    //auto jest juz wypozyczone
                    System.out.println("Auto o vin " + vin + " zostalo juz wypozyczone");
                    return null;
                } else {
                    //auto nie jest jeszcze wypozyczone
                    Rental rental = new Rental(user, carStorage.checkIfVin(vin));
                    System.out.println(rental);
                    rentalStorage.addRental(rental);

                    double ClassPrice = 200;
                    if (rental.getKlasa() == "standard") {
                        ClassPrice = stardardPrice;
                    }
                    if (rental.getKlasa() == "premium") {
                        ClassPrice = premiumPrice;
                    }
                    if (rental.getKlasa() == "exclusive") {
                        ClassPrice = exclusivePrice;
                    }
                    if (rental.getKlasa() == "boss") {
                        ClassPrice = bossPrice;
                    }

                    double price = ChronoUnit.DAYS.between(startDate, endDate) * ClassPrice;
                    RentalInfo paragon = new RentalInfo(price, startDate, endDate);
//                    System.out.println("Paragon: " + paragon);
                    return paragon;
                }
            } else {
                //auto o danym vin nie istnieje
                System.out.println("Auto o takim vin nie istnieje!");
                return null;
            }
        }
        System.out.println("Brak aut w CarStorage");
        return null;
    }

    public double getStardardPrice() {
        return stardardPrice;
    }

    public double getPremiumPrice() {
        return premiumPrice;
    }

    public double getExclusivePrice() {
        return exclusivePrice;
    }

    public double getBossPrice() {
        return bossPrice;
    }
}
