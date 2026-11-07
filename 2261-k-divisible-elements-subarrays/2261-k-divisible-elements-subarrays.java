class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        
        Set<String> set = new HashSet<>() ;

        for(int i = 0 ; i < nums.length ; i++){

            int count = 0 ;

            StringBuilder res = new StringBuilder() ;

            for(int j = i ; j < nums.length ; j++){

                if(nums[j] % p == 0)count++;
                if(count > k)break ;
                res.append(nums[j] + " ") ;
                set.add(res.toString()) ;
            }
        }
        return set.size() ;
    }
}