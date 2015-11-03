package com.hardwhere.model;

/**
 * Created by menaka on 11/3/15.
 *
 * Class for holding data about business
 *
 */
public class Business {

    private Person owner;
    private Address address;
    private String name;
    private String telephone;

    private BusinessType type;

    public Business(Person person, Address address, String name, String telephone, BusinessType type){
        this.owner = person;
        this.address = address;
        this.name = name;
        this.telephone = telephone;
        this.type = type;
    }



}
