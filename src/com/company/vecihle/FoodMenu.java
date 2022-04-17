package com.company.vecihle;

public enum FoodMenu {

    APPETIZER("Steam Prawn", "Caffe Latte"),
    DESSERT("Cupcakes", "Milk and Chocolate Ice Cream");

    private String firstItem;
    private String secondItem;

    FoodMenu(String firstItem, String secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public String getFirstItem() {
        return firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }
}
