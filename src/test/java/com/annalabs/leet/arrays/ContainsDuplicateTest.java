package com.annalabs.leet.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ContainsDuplicateTest {

    @Autowired
    ContainsDuplicate containsDuplicate;

    @Test
    void contextLoads() {
        assertTrue(containsDuplicate.hasDuplicate(new int[] {1,2,3,3}));
        assertFalse(containsDuplicate.hasDuplicate(new int[] {1,2,3,4}));
    }
}