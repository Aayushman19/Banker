import java.util.*;

@SuppressWarnings("unused")
public class AccountDetails {

    public AccountDetails() {
    }
    public int accno;
    public String acc_type;

    public void withdraw() {
        //Fetch account_no && account_type from system
        //Fetch balance from account_no
        //Get withdrawn amount from user
        //Account_balance -= withdrawn and update
        //Add to statement
        //Add x->y transaction
    }

    public void deposit() {
        //Fetch account_no && account_type from system
        //Fetch balance from account_no
        //Get deposit amount from user
        //Account_balance += withdrawn and update
        //Add to statement
        //Add x->y transaction
    }
}