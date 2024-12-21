package com.annalabs.leet.twoPointers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ValidPalindromeTest {

    @Autowired
    ValidPalindrome validPalindrome;

    @Test
    void isPalindrome() {
        assertTrue(validPalindrome.isPalindrome("aba"));
        assertFalse(validPalindrome.isPalindrome("racec3r"));
    }
}