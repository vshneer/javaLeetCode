package com.annalabs.leet.arrays;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ProductsOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        int multiplier = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] *= multiplier;
            multiplier *= nums[i];
        }
        multiplier = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= multiplier;
            multiplier *= nums[i];
        }
        return result;
    }
}
