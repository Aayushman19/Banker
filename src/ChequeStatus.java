import java.util.*;

// @SuppressWarnings("unused")
public class ChequeStatus {
    public ArrayList<Integer> cheque_record = new ArrayList<Integer>();
    
    public ChequeStatus() {
    }

    public int cheque_no;
    public String cheque_date;
    public String cheque_status_message;

    public void cheque_status() {
        IssueCheque iCheque = new IssueCheque(cheque_no, cheque_date);
        if (iCheque.issued) {
            cheque_status_message = "Cheque Issued";
        } else {
            cheque_status_message = "Not Issued";
        }
        System.out.println(cheque_status_message);
    }

}
