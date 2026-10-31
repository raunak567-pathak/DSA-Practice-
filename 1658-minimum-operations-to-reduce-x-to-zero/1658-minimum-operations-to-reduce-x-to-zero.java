class Solution {
    public int minOperations(int[] nums, int x) {
        
        int sum = 0 ;
        for(int num : nums){
            sum += num ;
        }

        int target = sum - x ;
        int n = nums.length ;

        if(target == 0)return n ;
        if(target < 0 )return -1;

        int max = -1 ;
        int curr = 0;
        int j = 0 ;

        for(int i = 0 ; i < n ; i++){
            curr += nums[i];


            while(curr > target && j < i){

                curr -= nums[j];
                j++;
            }

            if(curr == target){
                max = Math.max(max , i - j +  1) ;
            }
        }
        return (max == -1) ? -1 : n - max ;
    }
}