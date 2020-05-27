package com.test.program.example.SuanFaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZZiXing {
    public static void main(String[] args) {
        System.out.println(convert2("hdhsakdhksjadhkjsadsa" , 4));

    }

    public static String convert2(String s, int numRows) {
        StringBuilder str = new StringBuilder();
        // 定义步长
        int step = numRows*2 - 2;
        // 定义当前索引下标
        int index = 0;

        for (int i = 0 ; i < numRows ; i++) {

            // 定义add = 行数*2
            int add = i*2;
            index = i;

            while (index < s.length()) {

                str.append(s.substring(index, index+1));
                // add等于step减add 实现循环
                add = step - add;
                // 如果是最后一行，则步长为step 如果不是 则是add循环
                index += (i == 0 || i == numRows -1) ? step : add;
            }

        }

        return str.toString();
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        // 初始化集合
        List<StringBuilder> list = new ArrayList();
        for(int i = 0; i < numRows ; i++) {
            list.add(new StringBuilder());
        }

        // 当前行数
        int curr = 0;
        boolean flag = false;

        for (int i = 0 ; i < s.length() ; i++) {
            list.get(i).append(s.substring(i, i+1));
            // 如果遇到首行或末行就转换方向
            if (curr == 0 || curr == numRows -1) {
                flag = ! flag;
            }
            curr += flag ? 1 : -1;
        }

        // 所有行的字符拼接在一起
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i< numRows ; i++) {
            result.append(list.get(i));
        }

        return result.toString();

    }
}
