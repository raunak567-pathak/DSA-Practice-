class Solution {
    public int minCapability(int[] nums, int k) {
        
        int left = Integer.MAX_VALUE  ;
        int right = Integer.MIN_VALUE ; 

        for(int num : nums){

            if(num < left)left = num ;
            if(num > right) right = num ;
        }

        while(left < right){

            int mid = left + ((right - left) >> 1 );

            if(isValid(nums , mid , k))right = mid ;
            else left = mid + 1 ;
        }
        return right ;
    }

    boolean isValid(int [] nums , int target , int k){

        int count = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] <= target){
                count++;
                i++ ;
            }
        }
        return count >= k ;
    }
}