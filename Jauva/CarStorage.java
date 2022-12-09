package MPR.example.MPRwypozyczalnia;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarStorage {

        private Car hyundai = new Car("Hyundai", "I40", "1FAHP3F2XCL441653", "Premium");
        private Car opel = new Car("Opel", "Astra", "1XKDDT8X1YJ846768", "Standard");
        private Car daewoo = new Car("Daewoo", "Lanos", "1G6DS5ED6B0101022", "Standard");
        private Car audi = new Car("Audi", "A6", "1D4HB48N06F103898", "Premium");

        List<Car> carList = new ArrayList<>();

        public CarStorage(){
                carList.add(hyundai);
                carList.add(opel);
                carList.add(daewoo);
                carList.add(audi);
        }

        public List<Car> getCarList(){
                return carList;
        }

}
