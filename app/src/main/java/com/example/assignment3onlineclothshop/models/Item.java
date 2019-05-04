package com.example.assignment3onlineclothshop.models;

public class Item {
    String itemName, itemDescription, imageName, itemPrice;
    int imgId;


    public Item(String itemName, String itemDescription, String imageName, String itemPrice, int imgId) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.imageName = imageName;
        this.itemPrice = itemPrice;
        this.imgId = imgId;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
