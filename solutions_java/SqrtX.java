// ------------------------------------------------------------
// Leetcode 69: Sqrt(x)
// ------------------------------------------------------------
// Problem Summary:
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// The returned integer should be non-negative as well.
// ------------------------------------------------------------
// Approach:
// Use binary search: define a search range [left, right] from 0 to x.
// Calculate the middle element mid, square it and compare with x.
// If mid^2 > x, move right to mid-1.
// If mid^2 < x, move left to mid+1.
// If mid^2 == x, return mid.
// After loop, return right as floor(sqrt(x)).
// ------------------------------------------------------------

public class SqrtX {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 0, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square > x) {
                right = mid - 1;
            } else if (square < x) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
