import java.util.Arrays;

class Solution {
//LEETCODE EASY
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] clone = heights.clone();
        Arrays.sort(clone);

        for(int i = 0; i < heights.length; i++)
        {
            if (clone[i] == heights[i])
            {
                continue;
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}
