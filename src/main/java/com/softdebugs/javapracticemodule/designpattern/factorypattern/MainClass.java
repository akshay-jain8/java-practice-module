package com.softdebugs.javapracticemodule.designpattern.factorypattern;


/*
    * Factory design pattern is a creational design pattern.

    * The factory design pattern says that define an interface for creating object and let the subclasses decide
      which class to instantiate.
*/
class MainClass {
    public static void main(String args[]) {
        OSFactory osFactory = new OSFactory();
        OS obj = osFactory.getInstance("Open");
        obj.spec();
    }
}
