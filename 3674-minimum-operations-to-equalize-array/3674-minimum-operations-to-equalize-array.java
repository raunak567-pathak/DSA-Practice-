class Solution {
    public int minOperations(int[] nums) {
        
        int count = 0 ;

        for(int num : nums){
        if(num == nums[0]){
            count++;
        }
        }
        if(count < nums.length){
            return 1 ;
        }
        return 0 ;
    }
}