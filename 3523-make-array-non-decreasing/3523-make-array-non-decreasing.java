class Solution {
    public int maximumPossibleSize(int[] nums) {
        int res =  0 ;
        int prev = 0 ;

        for(int num : nums){
            if(prev <= num){
                prev = num ;
                res++;
            }
        }
        return res ;
    }
}