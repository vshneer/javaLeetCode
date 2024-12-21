package com.annalabs.leet.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LongestConsecutiveSequenceTest {
    @Autowired
    LongestConsecutiveSequence longestConsecutiveSequence;

    @Test
    void longestConsecutive() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        assert(longestConsecutiveSequence.longestConsecutive(nums) == 4);
    }
}