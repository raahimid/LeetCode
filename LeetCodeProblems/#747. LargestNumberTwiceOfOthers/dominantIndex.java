class Solution {
  //LEETCODE EASY
    public int dominantIndex(int[] nums) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > max)
            {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++)
        {
            if (max == nums[i])
            {
                continue;
            }
            if (!(max >= nums[i]*2))
            {
                return -1;
            }
        }
        return index;
    }
}
