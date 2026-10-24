class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length ;
        int sum = 0 ;

        int [] res = new int [n +  1] ;
        for(int i = 0 ; i < n ; i++){

            res[i + 1 ] =  arr[i] + res[i];
        }
        for(int i = 0 ; i < n ; i++){

            for(int j = 1 ; i + j <= n ; j += 2){

                int k = i + j ;

                sum += res[k] - res[i] ;
            }
        }
        return sum ;
    }
}