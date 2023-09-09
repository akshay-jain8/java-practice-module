package com.softdebugs.javapracticemodule.designpattern.singletonpattern;

/*
 Enum has private Constructor by default
 Enum is introduced in 1.5 version
*/
public enum EnumSingleton {
    INSTANCE;
    public void printValue(int i) {
        System.out.println("Value is: " + i);
    }
}

class MainClass5 {
    public static void main(String args[]) {
        EnumSingleton obj = EnumSingleton.INSTANCE;
        obj.printValue(2);
    }
}
