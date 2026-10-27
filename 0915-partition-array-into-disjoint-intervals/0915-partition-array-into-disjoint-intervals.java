class Solution {
    public int partitionDisjoint(int[] nums) {
        
        int right = nums[0] ;
        int left = nums[0] ;
        int count = 0 ;

        for(int i = 1 ; i < nums.length ; i++){

            right = Math.max(right , nums[i]);

            if(nums[i] < left){

                count = i ;

                left = right ;
            }
        }
        return count +  1;
    }
}