package com.softdebugs.javapracticemodule.designpattern.builderpattern;

public class OS {
    private final String name;
    private final String processor;
    private final int size;
    private final String battery;

    public OS (String name, String processor, int size, String battery) {
        this.name = name;
        this.processor = processor;
        this.size = size;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "OS{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                ", size=" + size +
                ", battery='" + battery + '\'' +
                '}';
    }
}
