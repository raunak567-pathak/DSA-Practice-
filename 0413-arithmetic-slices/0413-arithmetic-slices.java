class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int n = nums.length ;
        if(n < 3)return 0 ;
        return helper(nums , n , 0);
    }
    int helper(int [] nums , int n , int count){
        if(n < 3)return 0 ;

        if(nums[n-1] - nums[n-2] == nums[n-2] - nums[n-3]){
            count++;
            return count + helper(nums ,n - 1 , count );
        }else
        return helper(nums , n - 1, 0);
    }
}