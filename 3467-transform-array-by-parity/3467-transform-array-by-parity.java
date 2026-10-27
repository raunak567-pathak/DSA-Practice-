class Solution {
    public int[] transformArray(int[] nums) {
        
        int j = 0 ;

        int [] res = new int [nums.length ]; 
        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] % 2 == 0){

                res[j++] = 0 ;
            }
        }

        while(j < nums.length){

            res[j++] = 1 ;
        }
        return res ;
    }
}