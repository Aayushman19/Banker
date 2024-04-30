
import java.util.*;

@SuppressWarnings("unused")
public class IssueCheque extends ChequeStatus {
    
    public IssueCheque(int acc_no, String date) {
        this.date = date;
        this.acc_no = acc_no;
    }

    public int generateChequeNo(){
        double c_no = Math.random()*1000000;
        return (int)c_no;
    }

    public int cheque_no;
    public String date;
    public int acc_no;

    public void issue_cheque() {
        int c_no = generateChequeNo();
        System.out.println("Account number" + " " + acc_no);
        System.out.println("Cheque generated with cheque number" + " " + c_no);
        System.out.println("Date" + " " + ":" + " " + date);
    }

}
