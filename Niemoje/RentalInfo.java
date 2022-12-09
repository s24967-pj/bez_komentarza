package com.example.demo;

import java.time.LocalDate;

public class RentalInfo {
    private double price;
    private LocalDate startDate;
    private LocalDate endDate;

    public RentalInfo(double price, LocalDate startDate, LocalDate endDate) {
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
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
