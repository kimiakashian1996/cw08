package org.example.Model;

public class Admin extends User{
private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Admin(String userName, String password, String name) {
        super(userName, password);
        this.name = name;
    }
}
