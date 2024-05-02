
import java.util.*;

@SuppressWarnings("unused")
public class StopCheque extends ChequeStatus {

    public StopCheque() {
        super(cheque_no, cheque_date);
    }

    public int acc_no;
    public static int cheque_no;
    public static String cheque_date;
    public String payee;

    public void stop_cheque() {
        System.out.println("Cancellation Request initiated for account number" + " " + acc_no);
        System.out.println("Cheque number" + " " + cheque_no);

        boolean valid = false;

        for(int i=0 ; i<cheque_record.size() ; i++){
            if(cheque_no == cheque_record.get(i)){
                valid = true;
            }
        }

        if(!valid){
            System.out.println("Invalid Cheque number");
        }

        if(super.cheque_status_message == "Cheque Issued"){
            super.cheque_status_message = "Issue Terminated and Refund initiated";
            super.cheque_status();
        }
    }

}
