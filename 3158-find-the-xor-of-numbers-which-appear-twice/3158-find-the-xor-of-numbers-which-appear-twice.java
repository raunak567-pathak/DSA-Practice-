class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        int xor = 0 ;

        Map<Integer,Integer> map = new HashMap<>() ;

        for(int num : nums ) {
            
            map.put(num , map.getOrDefault(num ,  0) + 1 ) ;
        }

        for(Map.Entry<Integer,Integer> mp : map.entrySet()) {

            if(mp.getValue() == 2 ){

                xor ^= mp.getKey() ;
            }
        }

        return xor ;
    }
}