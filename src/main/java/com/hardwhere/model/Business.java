package com.hardwhere.model;

import java.util.LinkedList;

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
    private LinkedList<Item> itemList = new LinkedList<Item>();

    private BusinessType type;

    public Business(Person person, Address address, String name, String telephone, BusinessType type){
        this.owner = person;
        this.address = address;
        this.name = name;
        this.telephone = telephone;
        this.type = type;
    }

    public boolean addItem(Item item){
        if(item != null)
            this.itemList.add(item);
        else
            return false;

        return true;
    }

    public LinkedList<Item> getItemList() {
        return itemList;
    }

    public Person getOwner() {
        return owner;
    }
}
