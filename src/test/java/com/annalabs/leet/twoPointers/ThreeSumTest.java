package com.annalabs.leet.twoPointers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ThreeSumTest {

    @Autowired
    ThreeSum threeSum;

    @Test
    void threeSumTest() {
        assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)).hashCode(), threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}).hashCode());
    }

    @Test
    void threeSumTest1() {
        assertEquals(List.of(List.of(-4, 0, 4), List.of(-4, 1, 3), List.of(-3, -1, 4), List.of(-3, 0, 3), List.of(-3, 1, 2), List.of(-2, -1, 3), List.of(-2, 0, 2), List.of(-1, -1, 2), List.of(-1, 0, 1)).hashCode(), threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4}).hashCode());
    }
}