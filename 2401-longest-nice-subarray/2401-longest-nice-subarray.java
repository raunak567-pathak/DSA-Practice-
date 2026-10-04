class Solution {
    public int longestNiceSubarray(int[] nums) {
        
        int n = nums.length ;
        int max = 0 ;
        int j = 0 ;
        int curr = 0  ;

        for(int i = 0 ; i < n ; i++){

            while((curr & nums[i] ) != 0){
                curr ^= nums[j];
                j++;
            }
            curr |= nums[i];

            max = Math.max(max , i - j + 1);
        }
        return max ;
    }
}