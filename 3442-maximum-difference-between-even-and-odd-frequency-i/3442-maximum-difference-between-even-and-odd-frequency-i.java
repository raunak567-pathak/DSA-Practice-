class Solution {
    public int maxDifference(String s) {
        

        int odd = Integer.MIN_VALUE ;
        int even = Integer.MAX_VALUE ;

        Map<Character,Integer> map = new HashMap<>() ;

        for(char c : s.toCharArray()){

            map.put(c , map.getOrDefault(c , 0 ) + 1 );
        }

        for(int count : map.values()){

            if((count & 1 ) == 1){

                odd = Math.max(odd , count );
            }else{
                even = Math.min(even , count );
            }
        }
        return odd - even ;
    }
}