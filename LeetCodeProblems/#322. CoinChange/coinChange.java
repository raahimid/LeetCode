class Solution {
//a dynamic programming approach from a bottom-up solution.
//solution is O(S*n)

//LEETCODE MEDIUM
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        //max is an arbitrary number that will always be above amount;
        int max = amount + 1;
        //fill the dp with max to compare values
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        //dp at 0 will always be 0.
        dp[0] = 0;

        for(int i = 1; i <= amount; i++)
        {
                for(int j = 0; j < coins.length; j++)
                {
                    if(coins[j] <= i)
                    {
                         dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                    }
                    else{
                        break;
                    }
                }
        }
        //if dp at target index is greater than the amount, it is not able to be broken up in change.
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
