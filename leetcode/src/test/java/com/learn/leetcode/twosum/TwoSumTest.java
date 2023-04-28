package com.learn.leetcode.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TwoSumTest {

    @Test
    public void twoSumTest() {
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] expected = {0, 2};
        TwoSum sum = new TwoSum();
        int[] actual = sum.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }
}
