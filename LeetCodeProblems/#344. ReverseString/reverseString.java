class Solution {
  //2 pointer solution

  //LEETCODE EASY
    public void reverseString(char[] s) {
        int j = s.length - 1;
        int i = 0;

        while(i < j)
        {
            char k = s[i];
            s[i] = s[j];
            s[j] = k;
            i++;
            j--;
        }
    }
}
