package applicationManager.user;

public abstract class Account {
    int number;
    int totalBalance;
    int availableBalance;
    Customer owner;
    String accountType;

    public Account(int balance, Customer owner, String accountType) {
        this.totalBalance = balance;
        this.owner = owner;
        this.accountType = accountType;
        this.number = ((int)((Math.random() * ((100000 - 1000) + 1))) + 1000);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
