package com.softdebugs.javapracticemodule.functionalinterface;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {

    public static void main(String[] args) {
        Supplier<Float> supplier = () -> (float) (77.32 + 43.43);
        System.out.println(supplier.get());
    }
}
