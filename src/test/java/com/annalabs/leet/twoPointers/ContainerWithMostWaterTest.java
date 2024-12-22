package com.annalabs.leet.twoPointers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ContainerWithMostWaterTest {

    @Autowired
    ContainerWithMostWater containerWithMostWater;

    @Test
    void containerWithMostWaterTest(){
        assertEquals(36, containerWithMostWater.maxArea(new int[]{1,7,2,5,4,7,3,6}));
    }
}