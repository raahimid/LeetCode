class Solution {
  //Leetcode - Medium
  //Solution is Complexity of O(n) with 1ms Runtime
    public int[] productExceptSelf(int[] nums) {
        int[] dp = new int[nums.length];

        int len = nums.length;

        int product = 1;

        for(int i = 0; i < len; i++)
        {
            dp[i] = product;
            product *= nums[i];
        }

        product = 1;

        for (int i = len-1; i >= 0; i--)
        {
            dp[i] *= product;
            product *= nums[i];
        }
        return dp;

    }
}
