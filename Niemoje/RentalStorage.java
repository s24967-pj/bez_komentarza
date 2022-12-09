package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {
    private List<Rental> rentalList = new ArrayList<>();

    public RentalStorage() {
        rentalList.add(new Rental(new User("Tomek"),new Car("","","",CarType.STANDARD)));

    }

    public List<Rental> getRentalList() {
        return rentalList;
    }
}
