import java.util.*;

// @SuppressWarnings("unused")
public class ChequeStatus extends Main{
    public ArrayList<Integer> cheque_record = new ArrayList<Integer>();
    
    public ChequeStatus(int cheque_no, String cheque_date) {
        this.cheque_no = cheque_no;
        this.cheque_date = cheque_date;
    }

    public int cheque_no;
    public String cheque_date;
    public String cheque_status_message;

    public void printList(){
        for(int i=0 ; i<cheque_record.size() ; i++){
            System.out.println(cheque_record.get(i));
        }
    }

    public void cheque_status() {
        IssueCheque iCheque = new IssueCheque(cheque_no, cheque_date);
        iCheque.issue_cheque();
        if (iCheque.issued) {
            cheque_status_message = "Cheque Issued";
        } else {
            cheque_status_message = "Not Issued";
        }
        System.out.println(cheque_status_message);
    }

}
