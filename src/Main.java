import java.text.SimpleDateFormat;
import java.util.*;

// @SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());

        ChequeStatus cStatus = new ChequeStatus(1001, str);
        cStatus.cheque_status();

        StopCheque sCheque = new StopCheque(1001);
        sCheque.stop_cheque();

    }
}
