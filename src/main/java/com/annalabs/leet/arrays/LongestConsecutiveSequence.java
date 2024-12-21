package com.annalabs.leet.arrays;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        List<Integer> starts = new ArrayList<>();
        for(Integer i: set){
            if(!set.contains(i-1) && set.contains(i+1)){
                starts.add(i);
            }
        }
        int max = 1;
        for(Integer i: starts){
            int count = 1;
            while(set.contains(i+1)){
                count++;
                i++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
