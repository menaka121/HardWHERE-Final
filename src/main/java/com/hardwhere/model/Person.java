package com.hardwhere.model;

/**
 * Created by menaka on 11/3/15.
 * This is the class for holding person information.
 */
public class Person {


    /**
     * Basic attributes for Person.
     * Accessible only with getters and setters
     * **/
    private String name;
    private Address address;
    private String email;
    private String nic;
    private String telephoneNumber;
    private String userName;
    private String password;

    public Person(String name,
                  String email,
                  String nic,
                  String telephoneNumber,
                  String username,
                  String password,
                  Address address){
        this.address = address;
        this.email = email;
        this.name = name;
        this.nic = nic;
        this.telephoneNumber = telephoneNumber;
        this.userName = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getNic() {
        return nic;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    /**
     * Giving ability of change the address, username or password
     * */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
