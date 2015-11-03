package com.hardwhere.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by menaka on 11/3/15.
 * This is the class for holding person information.
 */
public class Person {


    /**
     * Basic attributes for Person.
     * Accessible only with getters and setters
     * **/
    private String firstName;
    private String lastName;
    private Address address;
    private String email;
    private String nic;
    private HashMap<String, String> telephoneNumber;
    private String userName;
    private String password;

    public Person(String firstName,
                  String lastName,
                  String email,
                  String nic,
                  HashMap<String, String> telephoneNumber,
                  String username,
                  String password,
                  Address address){
        this.address = address;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.telephoneNumber = telephoneNumber;
        this.userName = username;
        this.password = password;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String getAddress() {
        return address.toString();
    }

    public String getEmail() {
        return email;
    }

    public String getNic() {
        return nic;
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
