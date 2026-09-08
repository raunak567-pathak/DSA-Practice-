class Solution {
    public int centeredSubarrays(int[] nums) {
        int n = nums.length ;
        int count = 0 ;

        Set<Integer> set = new HashSet<>() ;
        
        for(int i = 0 ; i < n ; i++){

            long sum = 0 ;
            set.clear();

            for(int j = i ; j < n ; j++){

                sum += nums[j];

                set.add(nums[j]) ;

                if(sum >= Integer.MIN_VALUE && sum <= Integer.MAX_VALUE){
                    if(set.contains((int) sum)){
                        count++;
                    }
                }
            }
        }
        return count ;
    }
}