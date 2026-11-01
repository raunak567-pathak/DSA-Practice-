class Solution {
    public int longestSubarray(int[] nums) {
        
        int n = nums.length ;
        int ans = 0 ;
        int max = 0 ;
        int curr = 0 ;

        for(int num : nums){
            if(num ==  1)
            curr++;
            else{

                max = Math.max(max ,curr + ans) ;
                ans = curr ;
                curr = 0 ;
            }
        }
            max = Math.max(max , curr + ans) ;

            return max == n ? max - 1 : max ;
    }
}