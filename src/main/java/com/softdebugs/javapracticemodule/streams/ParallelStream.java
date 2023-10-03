package com.softdebugs.javapracticemodule.streams;

import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "World", "Welcome");
        long count = strings.parallelStream().filter(a -> a.length()> 5).count();
        System.out.println(count);
    }
}
