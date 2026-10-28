class Solution {
    public int minMoves(int[] nums) {
        

        int count = 0 ;
        int n = nums.length ;

        int min = nums[0];

        for(int i = 0 ; i < n ; i++){

            if(min > nums[i]){
                min = nums[i];
            }
        }

        for(int num : nums){

            count += (num - min );
        }
        return count ;
    }
}