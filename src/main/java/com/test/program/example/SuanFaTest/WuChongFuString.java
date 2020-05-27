package com.test.program.example.SuanFaTest;

import java.util.HashMap;

public class WuChongFuString {

    public static void main(String[] args) {
        int ans = test3("tmmzuxt");
        System.out.println(ans);

    }
    public static int test(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int n = s.length();
        int i = 0 , j = 0;
        int ans = 0;
        while (i < n && j < n) {
            if(!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), j);
                ans = Math.max(ans, j - i + 1);

            } else {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            j++;

        }
        return ans;

    }

    public static int test2(String s) {
        if (s.length()==0){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap();
        int ans = 0;
        int i = 0;
        for(int j = 0; j < s.length(); j ++){

            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), j);
                ans = Math.max(ans, j-i+1);

            } else {
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
        }
        return ans;

    }

    public static int test3(String s) {
        if (s.length()==0){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;

    }



}
