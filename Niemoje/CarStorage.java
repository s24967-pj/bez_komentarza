package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarStorage {
    private final List<Car> carList = new ArrayList<>();

    public CarStorage() {
        carList.add(new Car("Toyota", "Yaris", "aaabbbcccddd", CarType.STANDARD));
        carList.add(new Car("volkswagen", "Golf", "baabbbcccddd", CarType.STANDARD));
        carList.add(new Car("Opel", "Astra", "caabbbcccddd", CarType.PREMIUM));
    }

    public List<Car> getCars() {
        return carList;
    }
}
