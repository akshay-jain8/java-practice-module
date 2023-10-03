package com.softdebugs.javapracticemodule.streams;

import java.util.List;

public class SequentialStream {

    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "World", "Welcome");
        List<String> list = strings.stream().filter(a -> a.length()> 5).map(a-> a.toUpperCase()).toList();
        System.out.println(list);
    }
}
