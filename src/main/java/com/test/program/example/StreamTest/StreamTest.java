package com.test.program.example.StreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        List<Integer> list2 = list1.stream().map(Integer::parseInt).collect(Collectors.toList());

        for (Integer i : list2) {
            System.out.print(i);
            System.out.print("    -----    ");
            System.out.println(i.getClass());
        }


    }
}
