/*
------------------------------------------------------------
Leetcode 268: Missing Number
------------------------------------------------------------
Problem Summary:
Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.
------------------------------------------------------------ 
Approaches:
1. Mathematical Sum Approach:
    - Calculate the expected sum of numbers from 0 to n using the formula n*(n+1)/2.
    - Subtract the actual sum of the array from the expected sum to find the missing number.
2. XOR Approach:
    - XOR all numbers from 0 to n and XOR all numbers in the array.
    - The result will be the missing number since duplicates cancel out.
Notes:
------------------------------------------------------------
*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}


