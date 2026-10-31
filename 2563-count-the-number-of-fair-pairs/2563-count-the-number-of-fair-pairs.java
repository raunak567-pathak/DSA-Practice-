class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        
        Arrays.sort(nums ) ;

        return helper(nums , upper ) - helper(nums , lower - 1 ) ;
    }


    long helper(int [] nums , int target){

        int left = 0 ;
        int right = nums.length -  1;
        long count = 0 ;

        while(left < right ){

            if(nums[left] + nums[right] <= target){

                count += (right - left) ;

                left++;
            }else{

                right-- ;
            }
        }
        return count ;
    }
}