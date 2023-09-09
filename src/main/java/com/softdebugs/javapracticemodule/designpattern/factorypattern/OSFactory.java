package com.softdebugs.javapracticemodule.designpattern.factorypattern;

public class OSFactory {
    public OS getInstance(String str) {
        if(str.equals("Open")) {
            return new Android();
        } else if(str.equals("Recent")) {
            return new IOS();
        }
        else {
            return new Windows();
        }
    }
}

