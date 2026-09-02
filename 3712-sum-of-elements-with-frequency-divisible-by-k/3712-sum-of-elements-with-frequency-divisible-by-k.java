class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0 ) + 1);
        }

        int sum = 0 ;
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){

            int num = mp.getKey();
            int count = mp.getValue();

            if(count % k == 0){

                sum += num * count ;
            }
        }
        return sum ;
    }
}