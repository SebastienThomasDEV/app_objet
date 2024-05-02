package java_obj_banque.entities;

import java.util.Date;

public class Debit extends Operation{
    public Debit(Date date, double amount) {
        super(date, amount);
    }

    public String getType() {
        return "DEBIT";
    }
}
