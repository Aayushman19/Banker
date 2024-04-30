import java.text.SimpleDateFormat;
import java.util.*;


// @SuppressWarnings("unused")
public class Main {
    HashMap<Integer, ArrayList<String>>bankRecords = new HashMap<Integer, ArrayList<String>>();
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy"); 
        String str = ft.format(new Date());
        IssueCheque ic = new IssueCheque(1001, str);
        ic.issue_cheque();
    }
}
