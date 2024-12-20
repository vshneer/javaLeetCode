package com.annalabs.leet.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TwoSumTest {
    @Autowired
    TwoSum twoSum;

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    void twoSum1() {
        int[] nums = {4,5,-4,-3,6};
        int target = 10;
        int[] expected = {0, 4};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    void twoSum2() {
        int[] nums = {-10,-1,-18,-19};
        int target = -19;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}