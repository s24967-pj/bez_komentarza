package com.s24740.wypozyczalnia;

public class Rental {
    private User user;
    private Car car;

    public Rental(User user, Car car) {
        this.user = user;
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public Car getCar() {
        return car;
    }

    public String getVin(){
        return car.getVin().toString();
    }

    public String getKlasa(){
        return car.getKlasa();
    }

    @Override
    public String toString() {
        return "Rental{" +
                "user=" + user +
                ", car=" + car +
                '}';
    }
}
