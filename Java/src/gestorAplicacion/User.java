package gestorAplicacion;

import java.util.HashMap;

public class User extends Account{
    HashMap<String, String> usersList = new HashMap<>();

    public User(String name, String document, String email, String password) {
        super(name, document);
        this.email = email;
        this.password = password;
    }

    public void logIn(String document, String password){

    }

    public void logOut(String document, String password){

    }

}
