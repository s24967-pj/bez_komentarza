package MPR.example.MPRwypozyczalnia;

import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class CarService {
    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;


    public CarService(CarStorage carStorage, RentalStorage rentalStorage){
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }

    public Car getCar(String vinNumber){


        for (Car car : carStorage.getCarList()) {
            if(vinNumber.equals(car.getVin())){
                return car;
            }
        }
        return null;
    }

    public void rentCar(User user, String vin){
//        Rental rental = new Rental(user, getCar(vin));
//        System.out.println("wypozyczyles: " + rental);
        Car car = getCar(vin);
        if(car != null){
            List rentalList = ;
        }


  }

}

//    Rental rental = new Rental(user, getCar(vin));
//        System.out.println("wypozyczyles: " + rental);
//            if(rental.getVin() != null){
//                    System.out.println("auto zostalo juz wypozyczone");
//                    }
//                    System.out.println("wypozyczyles: " + rental);
