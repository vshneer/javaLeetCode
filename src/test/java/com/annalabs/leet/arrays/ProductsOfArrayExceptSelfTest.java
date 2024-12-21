package com.annalabs.leet.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class ProductsOfArrayExceptSelfTest {
    @Autowired
    ProductsOfArrayExceptSelf productsOfArrayExceptSelf;

    @Test
    void productExceptSelf() {
        int[] nums = {1, 2, 3, 4};
        assertArrayEquals(new int[]{24, 12, 8, 6}, productsOfArrayExceptSelf.productExceptSelf(nums));
    }

}