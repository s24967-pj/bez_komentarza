package MPR.example.MPRwypozyczalnia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class MpRwypozyczalniaApplication {

	private final CarService carService;
	private final RentalStorage rentalStorage;

	public MpRwypozyczalniaApplication(CarService carService){
		this.carService = carService;
		rentalStorage = new RentalStorage();
		rentalService();
	}

	public static void main(String[] args) {
		SpringApplication.run(MpRwypozyczalniaApplication.class, args);
	}

	private void rentalService(){

		//carService.getAllCars();
		//carService.getAllRentals();

		carService.rentCar(new User("Alicja"), "1FAHP3F2XCL441653" );
	}

}
