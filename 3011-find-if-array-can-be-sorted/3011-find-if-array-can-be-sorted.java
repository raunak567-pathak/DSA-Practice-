class Solution {
    public boolean canSortArray(int[] nums) {
        
        int n = nums.length ;
        int i = 0 ;

        int prev = Integer.MIN_VALUE ;

        while(i < n){

            int curr = Integer.bitCount(nums[i]) ;
            int max = nums[i] ;
            int min = nums[i] ;

            while(i < n && Integer.bitCount(nums[i]) == curr){

                min = Math.min(min , nums[i]) ;
                max = Math.max(max , nums[i]) ;
                i++;
            }
            if(prev > min ){
                return false;

            }

            prev = max ;
        }
        return true ;
    }
}