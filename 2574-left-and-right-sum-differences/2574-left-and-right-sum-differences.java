class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int n = nums.length ;

        int [] ans = new int [n] ;

        for(int i = 0 ;i < n ; i++){

            int left = 0 ;
            int right = 0 ;
            int j = i - 1 ;
            int k = i + 1 ;

            while(j >= 0){
                left += nums[j];
                j--;
            }
            while(k < n){
                right += nums[k];
                k++;
            }
            ans[i] = Math.abs(left - right);
        }
        return ans ;
    }
}