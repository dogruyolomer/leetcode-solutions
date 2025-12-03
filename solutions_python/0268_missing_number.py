# ------------------------------------------------------------
# Leetcode 268: Missing Number
# ------------------------------------------------------------
# Problem Summary:
# Given an array nums containing n distinct numbers in the range [0, n], 
# return the only number in the range that is missing from the array.
# ------------------------------------------------------------ 
# Approaches:
# 1. Mathematical Sum Approach:
#    - Calculate the expected sum of numbers from 0 to n using the formula n*(n+1)/2.
#    - Subtract the actual sum of the array from the expected sum to find the missing number.
# 2. XOR Approach:
#    - XOR all numbers from 0 to n and XOR all numbers in the array.
#    - The result will be the missing number since duplicates cancel out.
# Notes:
# ------------------------------------------------------------

from typing import List

def missingNumber_sum(nums):
    n = len(nums)
    expected = n * (n + 1) // 2
    actual_sum = sum(nums)
    return expected - actual_sum
 
def missingNumber_xor(nums):
    n = len(nums)
    result = 0

    for i in range(n+1):
        result ^= i

    for num in nums:
        result ^= num

    return result
