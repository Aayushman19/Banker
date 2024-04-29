
import java.util.*;

@SuppressWarnings("unused")
public class Customer {

    public Customer(int user_id, String password, String name, String address) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public int user_id;
    public String password;
    public String name;
    public String address;

    public void login(int uid, String pass) {
        if(uid == user_id && pass == password){
            System.out.println("User Logged In Successfully!");
            System.out.println("Welcome" + " " + name);
            System.out.println("Address" + " : " + address);
        }
        else{
            System.out.println("Invalid ID or Password");
            return;
        }
    }

    public void logout() {
        System.out.println("Logged out successfully");
        return;
    }

}