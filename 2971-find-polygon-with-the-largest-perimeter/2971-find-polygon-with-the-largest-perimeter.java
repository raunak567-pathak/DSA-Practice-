class Solution {
    public long largestPerimeter(int[] nums) {
        
        Arrays.sort(nums ) ;
        long sum = 0 ;
        long max = -1 ;

        for(int num : nums){

            if(sum > num)max = Math.max(max , sum + num );
            sum += num ;
        }
        return max ;
    }
}