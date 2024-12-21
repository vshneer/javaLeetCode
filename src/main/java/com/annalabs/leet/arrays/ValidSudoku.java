package com.annalabs.leet.arrays;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

@Component
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> col = new HashMap<>();
        HashMap<Integer, HashSet<Character>> square = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            col.put(i, new HashSet<>());
            square.put(i, new HashSet<>());
        }
        for (int r = 0; r < board.length; r++) {
            HashSet<Character> row = new HashSet<>();

            for (int c = 0; c < board[r].length; c++) {
                char value = board[r][c];
                if (value == '.') continue;
                if (row.contains(value)) return false;
                row.add(value);
                if (col.get(c).contains(value)) return false;
                col.get(c).add(value);
                if (square.get((((r/3)*3)+c/3)).contains(value)) return false;
                square.get((((r/3)*3)+c/3)).add(value);
            }
        }
        return true;
    }
}
