package java_obj_banque.entities;

import java.util.Date;

public abstract class Operation {
    public Date date;
    public double amount;

    public Operation(Date date, double amount) {
        this.date =date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "date=" + date +
                ", amount=" + amount +
                '}';
    }

    public abstract String getType();
}
