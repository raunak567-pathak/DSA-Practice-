class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        long sum = 0 ;
        long max = 0 ;
        int j = 0;

        Set<Integer> set = new HashSet<>() ;

        for(int i = 0 ; i < nums.length ; i++){
            while(set.contains(nums[i])){

                set.remove(nums[j]);
                sum -= nums[j];
                j++;
            }

            set.add(nums[i]);
            sum += nums[i] ;

            if( i - j + 1 == k){
                max = Math.max(max , sum  ) ;
                set.remove(nums[j]);
                sum -= nums[j];
                j++;
            }
        }
        return max ;
    }
}