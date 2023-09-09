package com.softdebugs.javapracticemodule.designpattern.builderpattern;

/*
    * Builder design pattern is a creational design pattern.

    * Builder pattern aims to Separate the construction of a complex object from its representation
      so that the same construction process can create different representations.
*/
class MainClass {
    public static void main(String args[]) {
        OSBuilder osBuilder = new OSBuilder();
        osBuilder.setName("IOS");
        OS obj = osBuilder.getOS();
        String str = obj.toString();
        System.out.println(str);
    }
}
