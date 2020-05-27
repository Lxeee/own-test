package com.test.program.example.DataTest;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest4 {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s = "0000-00-00 00:00:00";
        LocalDateTime ldt = LocalDateTime.parse(s,df);


        String s2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(ldt);

        System.out.println(s2);


    }
}
