package com.s24740.wypozyczalnia;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarStorage {
    private Car audiA4 = new Car("Audi", "A4B8", "2A4RR5D17AR386995", "standard");
    private Car porsche = new Car("Porsche", "Macan 2.0", "SALWG2WFXEA350484", "premium");
    private Car mustang = new Car("Ford", "Mustang Mach 1 5.0 V8", "3B7HC12Y4XG226857", "exclusive");
    private Car skoda = new Car("Skoda", "Karoq", "YV1RH527452477110", "boss");
    private List<Car> samochodList = new ArrayList<>();

    public CarStorage() {
        samochodList.add(audiA4);
        samochodList.add(porsche);
        samochodList.add(mustang);
        samochodList.add(skoda);
    }

    public List getSamochodList(){
        return samochodList;
    }

    public Car checkIfVin(String vin){
        for(Car car : samochodList) {
            if(car.getVin().equals(vin)){
                return car;
            }
        }
        return null;
    }
}
