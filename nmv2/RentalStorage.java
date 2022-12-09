package com.s24740.wypozyczalnia;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {
    private List<Rental> rentalList = new ArrayList<>();

    private final CarStorage carStorage;

    public RentalStorage(CarStorage carStorage) {
        this.carStorage = carStorage;
    }

    public List getRentalList(){
        return rentalList;
    }

    public void addRental(Rental rental){
        rentalList.add(rental);
    }

    public boolean checkIfRentalVin(String vin){
        for(Rental rental : rentalList) {
            if(rental.getVin().equals(vin)){
                return true;
            }
        }
        return false;
    }

}
