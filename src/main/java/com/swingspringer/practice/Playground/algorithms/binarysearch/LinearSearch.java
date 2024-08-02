package com.swingspringer.practice.Playground.algorithms.binarysearch;

import com.swingspringer.practice.Playground.algorithms.Algorithm;

import java.util.List;
import java.util.stream.Stream;

public class LinearSearch implements Algorithm {
    /**
     * Problem: Given a sorted array of n integers and a target value,
     * determine if the target exists in the array in logarithmic time
     * using the binary search algorithm. If target exists in the array,
     * print the index of it.
     */
    @Override
    public void execute() {
        int[] nums = {2, 3, 5, 7, 9};
        int target = 7;
        int result = linearApproach(nums, target);
        System.out.println("Index found at: " + result);
    }

    /**
     * My approach on this problem
     */
    public int linearApproach(int[] nums, int target) {
        int indexFound = -1;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num == target) {
                indexFound = num;
                break;
            }
        }
        return indexFound;
    }
}
