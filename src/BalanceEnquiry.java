
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class BalanceEnquiry {

    public BalanceEnquiry() {
    }

    public String acc_type;
    public int acc_no;
    public int balance;

    @SuppressWarnings({ "resource" })
    public void show_balance() {
        System.out.println("Enter Account Type");
        Scanner acc_t = new Scanner(System.in);
        String at  = acc_t.next();
        System.out.println("Enter Account number");
        Scanner acc_n = new Scanner(System.in);
        int an = acc_n.nextInt();
        
        switch (at) {
            case "Savings":
                System.out.println("Account number " + an + " " + "has" + " " + "Rs. 456446");
                break;

            case "Current":
                System.out.println("Your account does not have a current account");
                break;
            
            default:
                System.out.println("Invalid Account Type");
        }
    }

}
