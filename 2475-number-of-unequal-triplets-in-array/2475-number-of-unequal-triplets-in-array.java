class Solution {
    public int unequalTriplets(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1 );
        }

        int count = 0 ;
        int left = 0 ;
        int right = nums.length ;


        for(int num : map.values()){

            right -= num ;

            count += left * num * right ;

            left += num ;
        }
        return count ;
    }
}