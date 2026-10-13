class Solution {
    public int specialTriplets(int[] nums) {
         int n = 100001;
        int mod = 1000000007;

        int [] count  = new int [n] ;
        int [] res = new int [n];

        int max = 0 ; 

        for(int num : nums){

            max = (max + res[num]) % mod ;
            int t = num * 2 ;
            if(t < n){

                res[t] = (res[t] + count[t]) % mod ;
            }
            count[num]++;
        }
        return max ;
    }
}