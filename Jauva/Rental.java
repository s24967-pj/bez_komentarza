package MPR.example.MPRwypozyczalnia;

import java.util.ArrayList;
import java.util.List;

public class Rental {

    private User user;
    private Car car;

    public Rental(User user, Car car){
        this.user = user;
        this.car = car;
    }

    public User getUser(){
        return user;
    }

    public Car getCar(){
        return car;
    }

    List<Rental> rentalList = new ArrayList<>();


    public String getVin(){
        return car.getVin();
    };

    @Override
    public String toString() {
        return "Rental{" +
                "user=" + user +
                ", car=" + car +
                '}';
    }
}
