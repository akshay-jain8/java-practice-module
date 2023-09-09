package com.softdebugs.javapracticemodule.designpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final String name;
    private final List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        for (Component component : components) {
            System.out.println(name);
            component.showPrice();
        }
    }

    public void addComponents(Component com) {
        components.add(com);
    }
}
