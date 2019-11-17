class Solution {
  //LEETCODE EASY
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] == 0)
            {
                if (counter > max)
                {
                    max = counter;
                }
                counter = 0;
                continue;
            }
            if (nums[i] == 1)
            {
                counter += 1;
            }
        }
            if(counter > max)
            {
                return counter;
            }
            return max;
    }
}
