package MPR.example.MPRwypozyczalnia;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {

    private User Dawid = new User("Dawid");
    private User Gracjan = new User("Gracjan");
    private User Daria = new User("Daria");

    List<User> userList = new ArrayList<>();

    public RentalStorage(){
        userList.add(Gracjan);
        userList.add(Daria);
        userList.add(Dawid);
    }


    public void addUserToList(User user){
        userList.add(user);
    }
}
