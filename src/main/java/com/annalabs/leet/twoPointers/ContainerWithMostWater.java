package com.annalabs.leet.twoPointers;

import org.springframework.stereotype.Component;

@Component
public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int sq = (right - left) * Math.min(heights[left], heights[right]);
            max = Math.max(sq, max);
            if (heights[left] < heights[right]) {
                left++;
            } else if (heights[right] < heights[left]) {
                right--;
            } else {
                if (heights[right - 1] > heights[left]) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return max;
    }
}
