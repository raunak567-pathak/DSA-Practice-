class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        if(k < 0) return 0 ;
        return helper(nums , k) - helper(nums , k - 1 ) ;
    }

    int helper(int [] nums , int k ){

        int n = nums.length ;

        int odd = 0 ;
        int count = 0 ;
        int j = 0 ;

        for(int i = 0 ; i < n ; i++){

            if(nums[i] % 2 != 0){

                odd++;
            }

            while(odd > k){

                if(nums[j] % 2 != 0){

                    odd--;
                }
                j++;
            }

            count += i - j + 1 ;
        }
        return count ;
    }
}