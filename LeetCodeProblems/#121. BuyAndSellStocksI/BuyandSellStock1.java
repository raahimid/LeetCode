class Solution {
  //this is not an optimal solution. was my gateway into leetcode.
  //currently an O(n^2) solution.
  //LEETCODE EASY
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++)
        {
            for (int j = i + 1; j < prices.length; j++)
            {
                if(prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }return max;
    }
}
