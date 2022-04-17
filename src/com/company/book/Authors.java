package com.company.book;

public class Authors extends Book {

    private int age;
    private char gender;

    public Authors(String name, String authors, int price, int age, char gender) {
        super(name, authors, price);
        this.age = age;
        this.gender = gender;
    }

    static Authors authors1 = new Authors("Harry Potter and the Philosopher's Stone",
            "J.K.Rowling", 22, 46, 'F');
    static Authors authors2 = new Authors("To Kill a Mockingbird",
            "H.Lee Pulitzer", 24, 48, 'M');
    static Authors authors3 = new Authors("Nineteen Eighty-Four",
            "G.Orwell", 21, 39, 'M');

    public static void main(String[] args) {
        System.out.println("The author(s) of the book " + Authors.authors1.getName() +
                " is " + Authors.authors1.getAuthors());
        System.out.println("The author(s) of the book " + Authors.authors3.getName() +
                " is " + Authors.authors3.getAuthors());
    }
}
