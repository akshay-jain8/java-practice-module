package com.softdebugs.javapracticemodule.functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterfaceImpl {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(2,4);
    }
}
