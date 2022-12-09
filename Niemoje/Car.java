package com.example.demo;

public class Car {
    private String make;
    private String model;
    private String vin;
    private CarType carType;

    public Car(String carMake, String carModel, String carVin, CarType carCarType) {
        this.make = carMake;
        this.model = carModel;
        this.vin = carVin;
        this.carType = carCarType;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", carType=" + carType +
                '}';
    }
}
