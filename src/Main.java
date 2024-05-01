import java.text.SimpleDateFormat;
import java.util.*;

// @SuppressWarnings("unused")
public class Main {
    
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        IssueCheque ic = new IssueCheque(1001, str);
        ic.issue_cheque();

        ChequeStatus cStatus = new ChequeStatus();
        cStatus.cheque_status();
        
        StopCheque sCheque = new StopCheque(1001, 12345);
        sCheque.stop_cheque();
    }
}
