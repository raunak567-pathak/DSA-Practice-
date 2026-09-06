class Solution {
    public int countPartitions(int[] nums) {
        int count = 0 ;
        int sum = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }

        int left = 0 ;
        for(int i = 0 ; i < nums.length - 1 ; i++){

            left += nums[i];

            int right = sum - left;

            if(Math.abs(right - left) % 2 == 0){
                count++;
            }
        }
        return count ;
    }
}