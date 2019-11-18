class Solution {
//LeetCode - Easy
//My solution is of O(n) time complexity and runs at 1ms.

    public void duplicateZeros(int[] arr) {

        //initialize an index that will carry over the number to the right of the array.
        //also make an array that will hold all the shifted numbers.
        int carry = 0;
        int[] copy = new int[arr.length];

        for (int x : arr)
        {
            //fill the copy array with current index then jump one index ahead.
            //if current index is 0, the copy array will jump 2 indexes ahead in middle if statement.
            copy[carry++] = x;

            if(carry >= arr.length)
            {
                break;
            }

            if(x == 0)
            {
                copy[carry++] = x;
            }

            if(carry >= arr.length)
            {
                break;
            }
        }
        //for loop for moving copy array to existing array.
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = copy[i];
        }
    }
}
