package com.test.program.example.SuanFaTest;

import java.util.HashMap;

public class HuiWenChar {

    public static void main(String[] args) {
        System.out.println(longestPalindrome4("abacab"));
    }


    public static String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        int ans = 0;
        int max = 0;
        HashMap<Integer, String> map = new HashMap();

        for (int i = 0 ;  i < s.length() ; i++ ) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                ans = Math.max(ans, i-left+1);
                map.put(ans, s.substring(left, i+1));
                left--;
            }
            while (right < s.length() && s.charAt(right) == s.charAt(i)) {
                ans = Math.max(ans, right-i+1);
                map.put(ans, s.substring(i, right+1));
                right++;
            }
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                ans = Math.max(ans, right-left+1);
                map.put(ans, s.substring(left, right+1));
                left--;
                right++;
            }

        }
        if (map.size() == 0) {
            return s.substring(0,1);
        }

        return map.get(ans);

    }

    public static String longestPalindrome2(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }

        int strLen = s.length();
        int left = 0;
        int right = 0;
        int maxStart = 0;
        int maxLen = 0;
        int len = 1;

        for(int i=0;i<strLen;i++){
            left = i - 1;
            right = i + 1;
            while(left >= 0 && s.charAt(left) == s.charAt(i)){
                left--;
                len++;
            }

            while(right < strLen && s.charAt(right) == s.charAt(i)){
                right++;
                len++;
            }
            while(left >= 0 && right < strLen && s.charAt(right) == s.charAt(left)){
                right++;
                left--;
                len+=2;
            }

            if(len > maxLen){
                maxLen = len;
                maxStart = left + 1;
            }
            len = 1;
        }
        return s.substring(maxStart,maxStart+maxLen);
    }

    public String longestPalindrome3(String s) {
        if (s.length() == 0) {
            return "";
        }
        int len = 1;
        int start = 0;
        int ans = 0;
        int left =0;
        int right = 0;

        for (int i = 0 ;  i < s.length() ; i++ ) {
            left = i - 1;
            right = i + 1;

            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                left--;
                len++;
            }

            while (right < s.length() && s.charAt(right) == s.charAt(i)) {
                right++;
                len++;
            }

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                len = len + 2;
            }

            if (len > ans) {
                ans = len;
                start = left + 1;
            }

            len = 1;

        }

        return s.substring(start, start+len);

    }

    public static String longestPalindrome4(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度

        boolean[][] dp = new boolean[strLen][strLen];

        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;

                    }
                }

            }

        }
        return s.substring(maxStart, maxEnd + 1);

    }



}
