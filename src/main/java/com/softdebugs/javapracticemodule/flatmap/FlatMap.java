package com.softdebugs.javapracticemodule.flatmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlatMap {
    public void setListList(){
        List<List<String>> listList = new ArrayList<>();

        List<String> stringList = List.of("Val1", "Val2");
        listList.add(stringList);

        List<String> result = listList.stream().flatMap(Collection::stream).toList();
        System.out.println(result);
    }

    public static void main(String[] args) {
        FlatMap flatMap = new FlatMap();
        flatMap.setListList();
    }
}
