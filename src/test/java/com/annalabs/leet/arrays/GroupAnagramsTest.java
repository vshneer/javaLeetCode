package com.annalabs.leet.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GroupAnagramsTest {

    @Autowired
    GroupAnagrams groupAnagrams;

    @Test
    void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        assertEquals(groupAnagrams.groupAnagrams(strs).stream().map(HashSet::new).collect(Collectors.toSet()), Set.of(Set.of("ate", "eat", "tea"), Set.of("nat", "tan"), Set.of("bat")));
    }
}