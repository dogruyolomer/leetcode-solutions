/*
------------------------------------------------------------
Leetcode 27 - Remove Element
------------------------------------------------------------
Problem Summary:
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place and return the new length.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
------------------------------------------------------------
Approach:
*/
#include <stdio.h>

int removeElement(int* nums, int numsSize, int val) {
    int k = 0;

    for (int i = 0; i < numsSize; i++) {
        if (nums[i] != val) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
}

int main() {
    int nums[] = {3, 2, 2, 3};
    int numsSize = 4;
    int val = 3;

    int newLength = removeElement(nums, numsSize, val);

    printf("New length: %d\n", newLength);
    printf("Modified array: ");
    for (int i = 0; i < newLength; i++) {
        printf("%d ", nums[i]);
    }
    printf("\n");

    return 0;
}
