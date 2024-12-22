package com.annalabs.leet.twoPointers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TwoIntegerSumIITest {
    @Autowired
    TwoIntegerSumII twoIntegerSumII;

    @Test
    void twoIntegerSumIITest() {
        assertEquals(Arrays.hashCode((new int[]{1, 2})), Arrays.hashCode(twoIntegerSumII.twoSum(new int[]{1, 2, 3, 4}, 3)));
    }
}