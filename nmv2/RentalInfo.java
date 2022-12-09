package com.s24740.wypozyczalnia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RentalInfo {
    private double price;
    private LocalDate startDate;
    private LocalDate endDate;

    public RentalInfo(double price, LocalDate startDate, LocalDate endDate) {
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;

        //jezeli startDate jest pozniej niz endDate to data jest na ujemnej wartosci dlatego wystarczy zmienic znak
        if(ChronoUnit.DAYS.between(startDate, endDate) < 0){
            this.price = this.price * (-1);
        }
    }

    @Override
    public String toString() {
        return "RentalInfo{" +
                "price=" + price +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
