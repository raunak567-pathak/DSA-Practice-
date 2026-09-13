class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        for(int i = 0 ; i < k ; i++){

            Arrays.sort(nums);

            nums[0] = -nums[0];
        }

        int count =  0 ;

        for(int num : nums){

            count += num ;
        }
        return count ;
    }
}