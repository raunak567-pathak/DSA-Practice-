class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int i = 0 ;
        int j = 0  ;
        int prod = 1 ;
        int count = 0 ;

        while(i < nums.length){
            prod *= nums[i++] ;

            while(j < i && prod >= k){
                prod /= nums[j++] ;
            }
            if(prod < k){
                count += i - j ;
            }
        }
        return count ;
    }
}