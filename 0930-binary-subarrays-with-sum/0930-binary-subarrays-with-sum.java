class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int n = nums.length ;

        if(goal < 0)return 0 ;

        return helper(nums , goal) - helper(nums , goal - 1);
    }
    int helper(int [] nums , int goal ) {

        int n = nums.length ;

        if(goal < 0) return 0 ;

        int sum = 0 ;
        int count = 0;

        int j = 0 ;

        for(int i = 0 ; i < n ; i++){

            sum += nums[i];

            while(sum > goal){
                sum -= nums[j] ;
                j++;
            }
            count += i - j + 1 ;
        }
        return count ;
    }
}