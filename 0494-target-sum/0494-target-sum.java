class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return helper(nums , 0 , 0 , target) ;

    }

    int helper(int [] nums , int i , int sum  , int target){

        if(i == nums.length){
            if(sum == target)return 1 ;
            return 0;
        }

        int pos = helper(nums , i + 1 , sum + nums[i] , target) ;

        int neg = helper(nums , i + 1 , sum - nums[i] , target) ;

        return pos + neg ;
    }
}