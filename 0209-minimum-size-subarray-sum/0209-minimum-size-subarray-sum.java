class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int curr = Integer.MAX_VALUE ; 
       int sum = 0 ;
       int i = 0 ;
       int j = 0 ;

       while(i < nums.length ){

        sum += nums[i];
        i++;

        while(sum >= target){

            int current = i - j ;
            curr = Math.min(curr , current);
            sum -= nums[j]; 
            j++;
        }
       }
       return curr == Integer.MAX_VALUE ? 0 : curr ;
    }
}