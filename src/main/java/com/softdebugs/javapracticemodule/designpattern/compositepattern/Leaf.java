package com.softdebugs.javapracticemodule.designpattern.compositepattern;

public class Leaf implements Component {

    private final String name;
    private final int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println("Component Name: " + name + " Price: " + price);
    }


}
