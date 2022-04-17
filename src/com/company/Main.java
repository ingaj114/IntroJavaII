package com.company;

import com.company.vecihle.FoodMenu;

public class Main {

    public static void main(String[] args) {
        //Abstraction is a mechanism that is focused on hiding implementation details
        //from the user. The user does not need to know how it was done, they only need
        //to know that it works

        //Vehicle car = new Motorcycle();
        //car.startEngine(true);

        //System.out.println(TaskMenu.FILE.getSecondItem());

        //Create an enum to model a restaurant menu
        //They offer 3 categories of meals: Appetizer, Main course and dessert
        //Appetizer - Steam Prawn and Caffe Latte
        //Main course - Continental rice and deep fried chicken
        //Dessert - Cupcakes and milk chocolate icecream

        //System.out.println(TaskMenu.MENU.getMenuSecond());
        System.out.println(FoodMenu.DESSERT.getFirstItem());
    }

}