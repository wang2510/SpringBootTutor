package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TwoSumRepository {

    private int[] nums;

    public TwoSumRepository() {
        nums = new int[] {1,2,4,5,7};
    }

    public int[] towSum(int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if (map.containsKey(rest)) {
                return new int[] {map.get(rest), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
