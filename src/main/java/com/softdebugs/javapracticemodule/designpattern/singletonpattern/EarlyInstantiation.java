package com.softdebugs.javapracticemodule.designpattern.singletonpattern;


/*
   * Singleton design pattern is a creational design pattern.

   * The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
*/
public class EarlyInstantiation {
    private int i;
    private static EarlyInstantiation obj = new EarlyInstantiation();
    private EarlyInstantiation() {}
    public static EarlyInstantiation getInstance() {
        return obj;
    }

    public void printValue(int n) {
        this.i = n;
        System.out.println("Value is: " + i);
    }
}

class MainClass1 {
    public static void main(String args[]) {
        EarlyInstantiation obj = EarlyInstantiation.getInstance();
        obj.printValue(2);
    }
}
