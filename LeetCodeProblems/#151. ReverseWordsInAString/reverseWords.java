//Given an input string, reverse the string word by word.

class Solution {

//LEETCODE MEDIUM

    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        //Input: "the sky is blue"
        //Output: "blue is sky the"
        String[] reverse = s.split("\\s+");

        for (int i = reverse.length - 1; i >= 0; i--)
        {
            reverse[i] = reverse[i].trim();
            str.append(reverse[i]);
            str.append(" ");
        }
        return str.toString().trim();
    }
}
