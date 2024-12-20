package com.annalabs.leet.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EncodeDecodeTest {

    public static final List<String> decoded_input = List.of("we", "say", ":", "yes", "!@#$%^&*()");
    public static final String encoded_input = "2#we3#say1#:3#yes10#!@#$%^&*()";
    @Autowired
    EncodeDecode encodeDecode;

    @Test
    void testEncode() {
        String encoded = encodeDecode.encode(decoded_input);
        assertEquals(encoded_input, encoded);
    }

    @Test
    void testDecoded() {
        List<String> decoded = encodeDecode.decode("2#we3#say1#:3#yes10#!@#$%^&*()");
        assertEquals(decoded_input.hashCode(), decoded.hashCode());
    }
}