class Solution {
  //leetcode - easy
    public boolean isPalindrome(String s) {
        //A man, a plan, a canal: Panama"
        //amanaplanacanalpanama
         if(s.length() == 1)
        {
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String reverse = sb.toString();
        System.out.println(reverse);
        if (reverse.equals(s)){
            return true;
        }
        else
        {
            return false;
        }
    }
}
