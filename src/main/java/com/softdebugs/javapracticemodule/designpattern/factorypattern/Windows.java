package com.softdebugs.javapracticemodule.designpattern.factorypattern;

public class Windows implements OS {

    @Override
    public void spec() {
        System.out.println("This is my OS");
    }
}
