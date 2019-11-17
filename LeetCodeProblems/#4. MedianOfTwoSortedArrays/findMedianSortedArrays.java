//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//You may assume nums1 and nums2 cannot be both empty.
class Solution {
//LEETCODE HARD

//The solution I came up with for this question is O(log (m+n)).
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        double median = 0;
        int start = nums1.length;

        //the first for loop will add all the numbers from the first array to our third array.
        for (int i = 0; i<nums1.length; i++)
        {
            nums3[i] = nums1[i];
        }

        //the second array will continue from where the first loop left off and add the second array.
        for (int j = 0; j <nums2.length; j++)
        {
            nums3[start++] = nums2[j];
        }

        //to efficiently find the median, sort it.
        Arrays.sort(nums3);
        int len = nums3.length;

        //if the length is even, get the middle 2 indexes and divide by 2.
        if(len % 2 == 0)
        {
            median = (double) (nums3[(len/2)-1] + nums3[(len/2)]) / 2;
            return median;
        }
        //if the median is odd, just divide index by 2 and return.
        else {
            median = nums3[(len/2)];
            return median;
        }
    }
}
