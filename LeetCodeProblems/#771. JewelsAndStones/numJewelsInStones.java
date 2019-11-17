class Solution {
//LEETCODE EASY
    public int numJewelsInStones(String J, String S)
    {

        if(J == null || J.length() == 0 || S == null || J.length() == 0)
        {
            return 0;
        }

        int jArr [] = new int [256];
        int sArr [] = new int [256];

        int count = 0;

        for(int i = 0; i < J.length(); i++)
        {
            jArr[J.charAt(i)]++;
        }

        for(int i = 0; i < S.length(); i++)
        {
            sArr[S.charAt(i)]++;
        }

        for(int i = 0; i < sArr.length; i++)
        {
            if(jArr[i] != 0 && sArr[i] != 0)
            {
                count += sArr[i];
            }
        }

        return count;
    }
}
