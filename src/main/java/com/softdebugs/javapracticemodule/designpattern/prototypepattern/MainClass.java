package com.softdebugs.javapracticemodule.designpattern.prototypepattern;


/*
    * The prototype pattern is a creational design pattern.

    * Prototype patterns are required, when object creation is time consuming, and costly operation,
      so we create objects with the existing object itself.
*/
public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop1 = new BookShop();
        shop1.setBookName("A1 Shop");
        shop1.loadBooks();
        BookShop shop2 = shop1.clone();
        shop2.setBookName("B1 Shop");

        shop1.removeBook(1);
        System.out.println(shop1);
        System.out.println(shop2);
    }
}
