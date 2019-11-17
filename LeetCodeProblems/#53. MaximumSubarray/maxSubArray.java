class Solution {
//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//LEETCODE EASY
    public int maxSubArray(int[] nums) {
    int result = nums[0];
    int[] sum =  new int[nums.length];
    sum[0] = nums[0];

    for(int i=1; i<nums.length; i++){
        sum[i] = Math.max(nums[i], sum[i-1] + nums[i]);
        result = Math.max(result, sum[i]);
    }

    return result;
}
}
