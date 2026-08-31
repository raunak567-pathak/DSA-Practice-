class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum = 0 , max = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            sum +=  nums[i];

            max = Math.max((sum + i) / (i + 1) , max);
        }
        return (int)max;
    }
}