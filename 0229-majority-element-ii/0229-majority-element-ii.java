class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>() ; 

        Map<Integer,Integer> map = new HashMap<>() ;

        for(int num : nums){

            map.put(num , map.getOrDefault(num , 0) + 1);

        }

        for(Map.Entry<Integer,Integer> mp : map.entrySet()){

            if(mp.getValue() > nums.length / 3){

                list.add(mp.getKey()) ;
            }
        }

        return list ;
    }
}