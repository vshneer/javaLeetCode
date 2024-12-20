package com.annalabs.leet.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ValidAnagramTest {

    @Autowired
    ValidAnagram validAnagram;

    @Test
    void isAnagram() {
        assertTrue(validAnagram.isAnagram("racecar", "carrace"));
        assertFalse(validAnagram.isAnagram("jar", "jam"));
    }
}