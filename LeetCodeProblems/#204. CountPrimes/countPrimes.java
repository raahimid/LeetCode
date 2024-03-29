class Solution {
//LEETCODE EASY
    public int countPrimes(int n) {

        int count=0;
        int[] arr = new int[n];
        Arrays.fill(arr,1);

        for(int i=2;i<n;i++){
            for(int j=2; i*j < n;j++){
                arr[i*j] = 0;
            }
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
            }
        }
        return count;
    }
}
