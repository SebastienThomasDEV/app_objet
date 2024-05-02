package java_obj_banque.entities;

import java.util.Date;

public class Credit extends Operation {
    public Credit(Date date, double amount) {
        super(date, amount);
    }

    public String getType() {
        return "CREDIT";
    }
}
