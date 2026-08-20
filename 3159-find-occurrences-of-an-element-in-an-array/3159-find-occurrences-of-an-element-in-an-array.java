class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0 ;
        int n = nums.length ;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == x){
                count++ ;
                map.put(count , i );

            }
        }
        for(int i = 0 ; i < queries.length ; i++){
            if(map.containsKey(queries[i])){
            queries[i] = map.get(queries[i]);
        }else{
            queries[i] = -1;
        }
        }
        return queries ;
    }
}