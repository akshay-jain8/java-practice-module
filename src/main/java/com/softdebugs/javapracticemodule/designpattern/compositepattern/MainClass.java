package com.softdebugs.javapracticemodule.designpattern.compositepattern;


/*
    * Composite design pattern is a structural design pattern.

    * It lets you compose objects into tree structures and then work with
      these structures as if they were individual objects.
*/
public class MainClass {

    public static void main(String args[]) {
        Composite composite = new Composite("Composite");
        Composite peripherals = new Composite("Peripherals");
        Leaf mouse = new Leaf("Mouse", 2000);
        peripherals.addComponents(mouse);
        composite.addComponents(peripherals);

        composite.showPrice();
    }
}
