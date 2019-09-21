package com.example.demo.repository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TwoSumRepository {
    List<Integer> nums = new ArrayList<Integer>();

    public TwoSumRepository() {
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
    }


    public int[] getTwoSum(String target) {
        int targetInt = Integer.parseInt(target);
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            if (!hashmap.containsKey(targetInt - nums.get(i))) {
                hashmap.put(targetInt - nums.get(i), i);
            } if (hashmap.containsKey(nums.get(i))) {
                return new int[]{hashmap.get(nums.get(i)), i};
            }

        }
        return new int[]{-1, -1};
    }



}


