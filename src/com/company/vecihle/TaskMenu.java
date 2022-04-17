package com.company.vecihle;

public enum TaskMenu {

/*    //An enum is a special type of object in java used to define constant values
    FILE("New", "Open", "Open Recent"),
    EDIT("Cut", "Copy", "Copy Path");

    private String firstItem;
    private String secondItem;
    private String thirdItem;

    TaskMenu(String firstItem, String secondItem, String thirdItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
    }
    public String getFirstItem() {
        return firstItem;
    }
    public String getSecondItem() {
        return secondItem;
    }
    public String getThirdItem() {
        return thirdItem;
    }
    */

    MENU("Appetizer", "Main course", "Dessert"),
    DISH("Steam Prawn and Caffe Latte", "Continental rice and deep fried chicken", "Cupcakes and milk chocolate Ice Cream");

    private String menuFirst;
    private String menuSecond;
    private String menuThird;

    TaskMenu(String menuFirst, String menuSecond, String menuThird) {
        this.menuFirst = menuFirst;
        this.menuSecond = menuSecond;
        this.menuThird = menuThird;
    }

    public String getMenuFirst() {
        return menuFirst;
    }

    public String getMenuSecond() {
        return menuSecond;
    }

    public String getMenuThird() {
        return menuThird;
    }
}
