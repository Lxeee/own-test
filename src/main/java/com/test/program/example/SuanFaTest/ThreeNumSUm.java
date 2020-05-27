package com.test.program.example.SuanFaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumSUm {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List result = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            int other = 0 - nums[i];
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                int sum = nums[i] + nums[k] + nums[i];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
                if (sum < 0 ) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;

    }
}
