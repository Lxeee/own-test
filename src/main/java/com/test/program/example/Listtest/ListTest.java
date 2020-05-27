package com.test.program.example.Listtest;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new LinkedList();
        Map<String, String> map = new HashMap<>();
        Map<String,String> map1 = new ConcurrentHashMap<>();
        Map<String,String> map2 = new TreeMap<>();
    }
}
