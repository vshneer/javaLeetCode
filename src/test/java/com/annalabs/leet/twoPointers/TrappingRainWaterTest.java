package com.annalabs.leet.twoPointers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TrappingRainWaterTest {

    @Autowired
    TrappingRainWater trappingRainWater;

    @Test
    void trappingRainWaterTest() {
        assertEquals(9, trappingRainWater.trap(new int[]{0, 2, 0, 3, 1, 0, 1, 3, 2, 1}));
    }

    @Test
    void trappingWaterTest() {
        assertEquals(0, trappingRainWater.trap(new int[]{1}));
    }

    @Test
    void trappingRainWaterTest1() {
        assertEquals(83, trappingRainWater.trap(new int[]{6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3}));
    }

    @Test
    void trappingRainWaterTest2() {
        assertEquals(0, trappingRainWater.trap(new int[]{1000, 999, 998, 997, 996, 995, 994, 993, 992, 991, 990, 989, 988, 987, 986, 985, 984, 983, 982, 981, 980, 979, 978, 977, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966, 966}));
    }
}
