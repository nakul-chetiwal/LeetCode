package com.learn.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 11,7, 15};
        TwoSum sum=new TwoSum();
        System.out.println(Arrays.toString(sum.twoSum(nums, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] indice = new int[2];
        Map<Integer, Integer> storeMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int x=target - nums[i];
            if (storeMap.containsValue(target - nums[i])) {
                for (Entry<Integer, Integer> entry : storeMap.entrySet()) {
                    if (entry.getValue() == (target - nums[i])) {
                        indice[0] = entry.getKey();
                        indice[1] = i;
                        break;
                    }
                }
            }
            storeMap.put(i, nums[i]);
        }
        return indice;
    }
}