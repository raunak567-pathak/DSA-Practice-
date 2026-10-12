class Solution {
    public int minMoves2(int[] nums) {
        
        int n = nums.length ;

        Arrays.sort(nums);
        int count = 0 ;
        int median = nums[n / 2 ] ;

        for(int i = 0 ; i < n ; i++){

            count += Math.abs(median - nums[i]) ;
        }
        return count ;
    }
}