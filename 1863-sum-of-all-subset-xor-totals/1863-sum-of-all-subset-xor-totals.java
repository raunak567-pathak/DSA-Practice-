class Solution {
    public int subsetXORSum(int[] nums) {
        
        return dfd(nums , 0 , 0 ) ;
    }

    private dfs(int [] nums , int start , int end){

        if(nums.length == start) {

            return end ;
        }

        int n1 = dfs(nums , start + 1 , end ^ nums[index]) ;
        int n2 = dfs(nums , start + 1 , end) ;

        return n1 + n2 ;
    }
}