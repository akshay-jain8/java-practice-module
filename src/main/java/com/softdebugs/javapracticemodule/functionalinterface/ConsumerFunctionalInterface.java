package com.softdebugs.javapracticemodule.functionalinterface;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

    public static void main(String[] args) {
        Consumer<String> consumer = a -> System.out.println(Double.parseDouble(a));
        consumer.accept("99");
    }
}
