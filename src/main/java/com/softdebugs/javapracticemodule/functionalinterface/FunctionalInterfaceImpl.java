package com.softdebugs.javapracticemodule.functionalinterface;

import java.util.function.Function;

public class FunctionalInterfaceImpl {

    public static void main(String[] args) {
        Function<String, Double> functionalInterface = a -> Double.parseDouble(a);
        double value = functionalInterface.apply("44");

        Runnable runnable = () -> System.out.println(value);
        runnable.run();
    }
}
