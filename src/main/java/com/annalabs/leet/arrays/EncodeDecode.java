package com.annalabs.leet.arrays;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class EncodeDecode {
    public String encode(List<String> strs) {
        return strs.stream().map(s -> s.length() + "#" + s).reduce((a, b) -> a + b).orElse("");
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        StringBuilder len = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                len.append(str.charAt(i));
            }
            if (str.charAt(i) == '#') {
                int newI = Integer.parseInt(len.toString());
                result.add(str.substring(i + 1, i + newI+1));
                i = i+newI;
                len = new StringBuilder();
            }
        }
        return result;
    }

}
