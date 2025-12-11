/*
------------------------------------------------------------
Leetcode 283 - Move Zeroes
------------------------------------------------------------
Problem Summary:
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
------------------------------------------------------------
Approach:
we use a two pass algorithm. 
    in the first pass, we iterate through the array and copy all non-zero elements to the front.
    in the second pass, we fill the remaining positions in the array with zeros.
------------------------------------------------------------
*/
void moveZeroes(int* nums, int numsSize) {
    int k = 0;

    for (int i = 0; i < numsSize; i++) {
        if (nums[i] != 0) {
            nums[k] = nums[i];
            k++;
        }
    }

    for (int i = k; i < numsSize; i++) {
        nums[i] = 0;
    }
    
}