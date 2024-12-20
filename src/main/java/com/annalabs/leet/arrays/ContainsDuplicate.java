package com.annalabs.leet.arrays;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;

@Component
public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        return Arrays.stream(nums).anyMatch(num -> {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
            return false;
        });
    }
}
