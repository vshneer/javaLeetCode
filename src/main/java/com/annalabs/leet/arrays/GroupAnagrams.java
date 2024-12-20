package com.annalabs.leet.arrays;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Component
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            for (int i = 0; i < str.length(); i++) {
                counts[str.charAt(i) - 'a']++;
            }
            if (!groups.containsKey(Arrays.hashCode(counts))) {
                groups.put(Arrays.hashCode(counts), new ArrayList<>());
            }
            groups.get(Arrays.hashCode(counts)).add(str);
        }
        System.gc();
        return groups.values().stream().toList();
    }
}
