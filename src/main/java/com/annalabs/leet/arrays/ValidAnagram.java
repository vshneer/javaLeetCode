package com.annalabs.leet.arrays;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;

@Component
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> ss = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer sscore = ss.getOrDefault(s.charAt(i), 0);
            ss.put(s.charAt(i), sscore + 1);
            Integer tscore = ss.getOrDefault(t.charAt(i), 0);
            ss.put(t.charAt(i), tscore - 1);
        }
        return ss.values().stream().allMatch(v -> v.equals(0));
    }

    public boolean isAnagramImproved(String s, String t){
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for(int i = 0; i<s.length(); i++){
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for(int count: counts){
            if(count != 0) return false;
        }
        return true;
    }
}
