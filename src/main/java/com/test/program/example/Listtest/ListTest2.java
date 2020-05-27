package com.test.program.example.Listtest;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();

//        list1.add(1);
//        list1.add(2);

        list2.add(2);
        list2.add(3);

        list1.retainAll(list2);


        System.out.println(list1);
        System.out.println(list2);
    }
}
