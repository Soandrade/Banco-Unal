package applicationManager.user;

public class CurrentAccount extends Account{
    public CurrentAccount(int balance, Customer owner) {
        super(balance, owner, "Current");
    }
}
