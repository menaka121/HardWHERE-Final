package com.hardwhere.test;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.hardwhere.model.Address;
import com.hardwhere.model.Person;


import java.util.HashMap;

/**
 * Created by menaka on 11/4/15.
 */
public class JsonPharserTester {

    //create a new person object and parse to json and retrieve it.


    public static void main(String[] args) {

        Address ad = new Address("smanala", "galdola", "Kotapola", "kotapola", "", "", "");
        HashMap<String, String> pb = new HashMap<String, String>();
        pb.put("Land", "041510005");
        pb.put("Mobile", "0718851183");
        Person p = new Person("Menaka", "j", "menaka@wso2.com", "143343432v", pb, "menalka", "menalka123", ad);


        //Converting the person object to a json string
        Gson gson = new Gson();
        String json = gson.toJson(p);

        System.out.println(json);

        System.out.println("==================================================");
        //Retrieve it back
        System.out.println("Getting data back");
        Person p2 = gson.fromJson(json, Person.class);


        System.out.println("Telephone numbers : Data structure = HashMap");
        System.out.println(p2.getTelephoneNumber());


        System.out.println("Mobile number only:");
        System.out.println(p2.getTelephoneNumber().get("Mobile"));


        System.out.println("Address: Address class ");
        System.out.println(p2.getAddress());


    }
}
