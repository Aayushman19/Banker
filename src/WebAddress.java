
import java.util.*;

@SuppressWarnings("unused")
public class WebAddress {

    public WebAddress(int user_id) {
        this.user_id = user_id;
    }

    public int user_id;
    public String password;

    public void web_services() {
        System.out.println("Web Services are not available at the moment for" + " " + user_id);
    }

}