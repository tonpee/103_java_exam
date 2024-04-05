package exam.unit;

import exam.base.OrgUnit;

public class School extends OrgUnit {

    private double balance;

    public School(int code, String name, double balance, String logging) {
        super(code, name, logging);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void earn(double amount) {
        balance += amount;
    }

    public void spend(double amount) {
        balance -= amount;
    }
}
