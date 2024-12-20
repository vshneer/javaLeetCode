package com.annalabs.leet.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TopKFrequentElementsTest {

    @Autowired
    TopKFrequentElements topKFrequentElements;

    @Test
    void topKFrequent() {
        int[] nums = {1,1,1,2,2,3};
        assertEquals(Arrays.hashCode((new int[]{1, 2})), Arrays.hashCode(topKFrequentElements.topKFrequent(nums, 2)));
    }
}