package applicationManager.user;

import java.util.ArrayList;

public class SavingAccount extends Account {
    int debt;
    ArrayList<Integer> penalties = new ArrayList<Integer>();
    ArrayList<Integer> loans = new ArrayList<Integer>();


    public SavingAccount(int balance, Customer owner) {
        super(balance, owner, "Saving");
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }
}
