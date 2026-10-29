class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left = helper(nums , target  - 1 );

        if(left == nums.length || nums[left] != target){

            return new int [] {-1 , -1};
        }

        int right = helper(nums , target) -1 ;

        return new int [] {left , right };
    }

    private int helper(int [] nums , int target ){

        int left = 0 ;
        int right = nums.length - 1 ;

        while(left <= right){

            int mid = left + ((right - left ) >> 1 ) ;


            if(nums[mid] <= target){

                left = mid + 1 ;
            }else{
                right = mid - 1 ;
            }
        }
        return left ;
    }
}