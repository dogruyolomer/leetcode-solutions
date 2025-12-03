# ------------------------------------------------------------
# Leetcode 66 : Plus One
# ------------------------------------------------------------
# Problem Summary:
# Given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
# The digits are ordered from most significant to least significant in left-to-right order.
# The large integer does not contain any leading 0's.
# Return the resulting array after adding one to the large integer.
# ------------------------------------------------------------
# Approach:
# we start iterating from the last element of the list, because we only need to increment
# if the last digit is not 9, we can simply increment it and return the list.
# but if the last digit is 9, adding 1 would cause a carry so we need to add 1 to the next digit.
# we continue this process until we have all digits processed.
# If all digits are 9, we need to add a leading 1 at the start of the list.
# ------------------------------------------------------------

from typing import List

def plusOne(digits):
    n = len(digits)

    for i in range(len(digits)-1, -1, -1):
        if digits[i]<9:
            digits[i] +=1
            return digits   
        
        digits[i] = 0

    return [1] + digits
