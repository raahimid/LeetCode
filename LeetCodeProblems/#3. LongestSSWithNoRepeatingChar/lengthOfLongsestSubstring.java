class Solution {
//Given a string, find the length of the longest substring without repeating characters.
//LEETCODE MEDIUM

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int j = 0;
        int i = 0;
        int len = s.length();

        Set<Character> set = new HashSet<>();

        while (i < len && j < len)
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());

            }
            else
            {
                set.remove(s.charAt(i++));
            }

        } return max;
    }
}
