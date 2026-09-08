class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length ;

        Map<Integer,Integer> map = new HashMap<>();

        long good = 0 ;

        for(int i = 0 ; i < n ; i++){

            int key = nums[i] - i ;

            good += map.getOrDefault(key , 0);

            map.put(key , map.getOrDefault(key , 0) + 1);
        }
        return (long)n * (n - 1) / 2 - good ;
    }
}