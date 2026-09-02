class Solution {
    public int[] singleNumber(int[] nums) {
        int []arr = new int[2];
        int idx = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getValue() == 1){
                arr[idx++] = mp.getKey();
            }
        }
        return arr;
    }
}