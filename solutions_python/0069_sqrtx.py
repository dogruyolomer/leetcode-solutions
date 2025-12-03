# ------------------------------------------------------------
# Leetcode 69: sqrt(x)
# ------------------------------------------------------------
# Problem Summary:
# Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
# The returned integer should be non-negative as well.
# -----------------------------------------------------------
# Approaches:
# 1) Binary Search – getting middle element and squaring it to compare with x
# ------------------------------------------------------------
# - Resource Links:
#   - https://web.itu.edu.tr/temiz/
#   - https://www.w3schools.com/python/python_dsa_binarysearch.asp
# ------------------------------------------------------------

def mySqrt(x):
    if x < 2:
        return x

    left, right = 0, x

    while left <= right:
        mid = (left + right) // 2
        square = mid * mid

        if square > x:
            right = mid - 1
        elif square < x:
            left = mid + 1
        else:
            return mid
    
    return right
