class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length ; 
        int j = 0 ;
        long count = 0 ;

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i = 0 ; i < n ; i++){

            map.put(nums[i] , map.getOrDefault(nums[i] , 0)  + 1);

            while(map.lastKey() - map.firstKey() > 2){

                map.put(nums[j]  , map.get(nums[j] ) - 1) ;
                if(map.get(nums[j]) == 0)map.remove(nums[j]);
                j++;
            }
            count += i - j + 1 ;
        }
        return count ; 
    }
}