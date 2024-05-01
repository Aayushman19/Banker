
import java.util.*;

@SuppressWarnings("unused")
public class StopCheque extends ChequeStatus {

    public StopCheque(int acc_no, int cheque_no) {
        this.acc_no = acc_no;
        this.cheque_no = cheque_no;
    }

    public int acc_no;
    public int cheque_no;
    public String cheque_date;
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
