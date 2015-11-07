package com.hardwhere.model;

/**
 * Created by tharinda on 11/4/15.
 */
public class Item {

    private double itemId;
    private Business business;
    private ItemType itemType;
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemImage;
    private String itemModel;
    private String itemBrand;
    private String itemSize;
    private float itemThickness;



    public double getItemId() {
        return itemId;
    }

    public void setItemId(double itemId) {
        this.itemId = itemId;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemModel() {
        return itemModel;
    }

    public void setItemModel(String itemModel) {
        this.itemModel = itemModel;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public float getItemThickness() {
        return itemThickness;
    }

    public void setItemThickness(float itemThickness) {
        this.itemThickness = itemThickness;
    }

    public String toString(){
        return "Item Name: " + this.getItemName()+
                "Item Description: " + this.getItemDescription()+
                "Price: " + this.getItemPrice();
    }
}
