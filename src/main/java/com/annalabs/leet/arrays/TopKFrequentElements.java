package com.annalabs.leet.arrays;

import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@Component
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> intToCounter = new HashMap<Integer, Integer>();
        for (int num : nums) {
            intToCounter.put(num, intToCounter.getOrDefault(num, 0) + 1);
        }
        return intToCounter.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    public int[] topKFrequentOnHeap(int[] nums, int k) {
        // Step 1: Build frequency map
        HashMap<Integer, Integer> intToCounter = new HashMap<>();
        for (int num : nums) {
            intToCounter.put(num, intToCounter.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a Min-Heap to keep top k elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : intToCounter.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest frequency element
            }
        }

        // Step 3: Extract elements from the heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }
}
