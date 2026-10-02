class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        int index = 0 ;

        int [] ans = new int [n * (n + 1 ) / 2 ];

        for(int i = 0 ; i < n ; i++){

            int sum = 0 ;

            for(int j = i ; j < n ; j++){

                sum += nums[j];

                ans[index++] = sum ;
            }
        }
        Arrays.sort(ans);

        int count = 0 , mod = 1000000007  ;

        for(int i = left - 1 ; i < right ; i++){

            count = (count + ans[i] ) % mod ;
        }
        return count ;
    }
}