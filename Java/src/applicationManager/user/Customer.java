package applicationManager.user;

public class Customer {
    String name;
    Account account;
    String identificationNumber;

    public Customer(String name, String identificationNumber){
        this.name = name;
        this.identificationNumber = identificationNumber;
    }

}
