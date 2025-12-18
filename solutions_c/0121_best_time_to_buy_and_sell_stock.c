/*
------------------------------------------------------------
Leetcode 121 - Best Time to Buy and Sell Stock
------------------------------------------------------------
Problem Summary:
Given an array prices where prices[i] is the price of a given stock on the ith day,
find the maximum profit you can achieve. You may complete at most one transaction
(i.e., buy one and sell one share of the stock). You cannot sell a stock before you buy one.
------------------------------------------------------------
Approach:
We iterate through the array while keeping track of the minimum price seen so far and the maximum profit.
For each price, we update the minimum price if the current price is lower.
We also calculate the potential profit by subtracting the minimum price from the current price
and update the maximum profit if this potential profit is higher than the previously recorded maximum profit.
------------------------------------------------------------
*/

int maxProfit(int* prices, int pricesSize) {
    int min_price = prices[0];
    int max_profit = 0;

    for (int i = 0; i < pricesSize; i++) {
        
        if (prices[i] < min_price) {
            min_price = prices[i];
        } 
        else if (prices[i] - min_price > max_profit) {
            max_profit = prices[i] - min_price;
        }
    }

    return max_profit;
}