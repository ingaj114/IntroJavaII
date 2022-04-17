package com.company.book;

public class Book {

    //Write a class called Book that has the following fields:
    //name, authors, price
    //Write another class called Author that contains following fields:
    //name, age, and the gender
    //create a list of books and return the following output for each book
    //The author(s) of the book "NAME_OF_BOOK" is/are: -----

    private String name;
    private String authors;
    public int price;

    public String getName() {
        return name;
    }
    public String getAuthors() {
        return authors;
    }
    public Book(String name, String authors, int price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
}