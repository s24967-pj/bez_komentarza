package com.s24740.wypozyczalnia;

public class Car {
    private String marka;
    private String model;
    private String vin;
    private String klasa;

    public Car(String marka, String model, String vin, String klasa){
        this.marka = marka;
        this.model = model;
        this.vin = vin;
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", klasa='" + klasa + '\'' +
                '}';
    }

    public Object getVin() {
        return this.vin;
    }

    public String getKlasa() {
        return this.klasa;
    }
}
