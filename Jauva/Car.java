package MPR.example.MPRwypozyczalnia;

public class Car {

    private String marka;
    private String model;
    private String vin;
    private String typ;

    public Car(String marka, String model, String vin, String typ) {
        this.marka = marka;
        this.model = model;
        this.vin = vin;
        this.typ = typ;
    }

    public String getVin(){
        return this.vin;
    }


    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", typ='" + typ + '\'' +
                '}';
    }
}
