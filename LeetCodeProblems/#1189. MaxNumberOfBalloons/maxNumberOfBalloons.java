class Solution {
    public int maxNumberOfBalloons(String text) {
      //The solution to this question is O(n). Runtime is 6ms.

        //Creates a hashmap that will hold all values for finding frequency.
        Map<Character, Integer> map = new HashMap<>();

        //initializing keys of B, A, L, O, N to find frequency.
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        //for loop iterating through string to find frequency of mapped characters.
        for(int i = 0; i<text.length(); i++)
            {
               if(map.containsKey(text.charAt(i)))
               {
                   //this line will store the frequency value of the key with an increment of 1 if encountered.
                   map.put(text.charAt(i), map.get(text.charAt(i))+1);
               }
            }
        //declaring local variables of the letters being used to find max # of balloons.
        int letterB = map.get('b');
        int letterA = map.get('a');
        int letterL = map.get('l') / 2; //you need 2 Ls to make a balloon
        int letterO = map.get('o') / 2; //you need 2 Os to make a balloon
        int letterN = map.get('n');

        //checking for the minumum number of a letter to find the max amount of balloons you can count.
        int maxBalloon = Math.min(Math.min(Math.min(letterB, letterA), Math.min(letterL, letterO)), letterN);


        return maxBalloon;
    }
}
