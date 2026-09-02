class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int max = 0 ;
        int count = 0 ;

        for(int num : nums){
            max= Math.max(num , max);

            count += max - num ; 
            max += 1 ;
        }
        return count ;
    }
}