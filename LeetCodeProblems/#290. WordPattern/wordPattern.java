class Solution {
//lEETCODE EASY
    public boolean wordPattern(String pattern, String str) {

        String[] words = str.split(" ");
        Map<Character, String> map = new HashMap<>();

        if (pattern.length() != words.length)
        {
            return false;
        }
        //making correlation
        for(int i = 0; i < pattern.length(); i++)
        {
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(words[i]))
            {
                map.put(pattern.charAt(i), words[i]);
            }
        }
        for(int i = 0; i < pattern.length(); i++)
        {
            if(!words[i].equals(map.get(pattern.charAt(i))))
            {
                System.out.println(map.get(pattern.charAt(i)));
                return false;
            }
        }

        return true;
    }
}
