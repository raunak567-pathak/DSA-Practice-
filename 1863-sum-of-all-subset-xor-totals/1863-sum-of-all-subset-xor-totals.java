class Solution {
    public int subsetXORSum(int[] nums) {
        
        return dfs(nums , 0 , 0 ) ;
    }

    private int  dfs(int [] nums , int start , int end){

        if(nums.length == start) {

            return end ;
        }

        int n1 = dfs(nums , start + 1 , end ^ nums[start]) ;
        int n2 = dfs(nums , start + 1 , end) ;

        return n1 + n2 ;
    }
}