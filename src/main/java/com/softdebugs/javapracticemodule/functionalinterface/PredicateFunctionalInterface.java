package com.softdebugs.javapracticemodule.functionalinterface;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    public static void main(String[] args) {
        Predicate<String> predicate = (a) -> a.equals("Hello");
        predicate.and(a-> a.startsWith("H")).or(a-> a.endsWith("o"));
        boolean result = predicate.test("Hello");
        System.out.println(result);
    }
}
