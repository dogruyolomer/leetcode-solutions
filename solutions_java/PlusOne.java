// ------------------------------------------------------------
// Leetcode 66: Plus One
// ------------------------------------------------------------
// Problem Summary:
// Given a large integer represented as an integer array digits, 
// where each digits[i] is the ith digit of the integer. 
// The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
// Return the resulting array after adding one to the large integer.
// ------------------------------------------------------------
// Approach:
// We start iterating from the last element of the array, because we only need to increment.
// If the last digit is not 9, we simply increment it and return the array.
// If the last digit is 9, adding 1 would cause a carry, so we set it to 0 and move left.
// We continue this process until all digits are processed.
// If all digits are 9, we need to add a leading 1 at the start of the array.
// ------------------------------------------------------------

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
