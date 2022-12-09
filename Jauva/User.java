package MPR.example.MPRwypozyczalnia;

public class User {
    private String accID;

    public User(String accID){

        this.accID = accID;
    }

    @Override
    public String toString() {
        return "User{" +
                "accID='" + accID + '\'' +
                '}';
    }
}
