//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
//LeetCode - Easy
//used a 1 pass solution in map

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int comp = target - nums[i];
            if(map.containsKey(comp))
            {
                return new int[] { map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
