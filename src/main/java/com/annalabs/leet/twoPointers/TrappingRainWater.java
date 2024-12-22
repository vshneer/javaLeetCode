package com.annalabs.leet.twoPointers;

import org.springframework.stereotype.Component;

@Component
public class TrappingRainWater {
    public int trap(int[] height) {
        if(height.length < 3){
            return 0;
        }
        int water = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right && (height[left] == 0 || height[left] <= height[left + 1])) {
            left++;
        }
        while (left < right && (height[right] == 0 || height[right] <= height[right - 1])) {
            right--;
        }
        int leftPeak = height[left];
        int rightPeak = height[right];
        while (left < right) {
            if (leftPeak < rightPeak) {
                left++;
                if (height[left] < leftPeak && left < right) {
                    water += leftPeak - height[left];
                } else if (height[left] > leftPeak) {
                    leftPeak = height[left];
                }
            } else if (rightPeak < leftPeak) {
                right--;
                if (height[right] < rightPeak && left < right) {
                    water += rightPeak - height[right];
                } else if (height[right] > rightPeak) {
                    rightPeak = height[right];
                }
            } else {
                // if peaks are equal I want to step forward lower continuation
                int newLeft = height[left + 1];
                int newRight = height[right - 1];
                if (newLeft > newRight) {
                    left++;
                    if (newLeft > leftPeak) {
                        leftPeak = newLeft;
                    }else if (left!=right){
                        water += leftPeak-newLeft;
                    }
                } else {
                    right--;
                    if (newRight > rightPeak) {
                        rightPeak = newRight;
                    }else if (left!=right){
                        water += rightPeak-newRight;
                    }
                }
            }
        }
        return water;
    }
}
