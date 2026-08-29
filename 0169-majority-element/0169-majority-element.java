class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int dominant = nums[0];
        int count = 0 ;

        for(int num : nums){
            map.put(num , map.getOrDefault(num ,0) + 1);

            if(map.get(num) > count){

            count = map.get(num);

            dominant =  num;
            }
        }
        return dominant;
    }
}