package com.softdebugs.javapracticemodule.designpattern.builderpattern;

public class OSBuilder {
    private String name;
    private String processor;
    private int size;
    private String battery;

    public void setName(String name) {
        this.name = name;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public OS getOS() {
        return new OS(name, processor, size, battery);
    }
}

