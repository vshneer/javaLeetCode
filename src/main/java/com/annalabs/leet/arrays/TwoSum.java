package com.annalabs.leet.arrays;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int missing = target - nums[i];
            Integer indexOfAFriend = seen.get(missing);
            if (indexOfAFriend != null) {
                result[0] = indexOfAFriend;
                result[1] = i;
                break;
            }
            seen.put(nums[i], i);
        }
        System.gc();
        return result;
    }
}
