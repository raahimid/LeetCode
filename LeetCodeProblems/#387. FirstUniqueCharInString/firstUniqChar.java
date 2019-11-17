// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        //store into hashmap by frequency
        for(int i = 0; i<s.length(); i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }


        //check frequency to find first unique
        for (int i = 0; i < s.length(); i++)
        {
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
