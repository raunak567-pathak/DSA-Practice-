class Solution {
    public String frequencySort(String s) {
        
        Map<Character,Integer> map = new HashMap<>() ;

        for(char c : s.toCharArray()){
            map.put(c ,  map.getOrDefault(c , 0 ) + 1 );
        }

        PriorityQueue<Map.Entry<Character,Integer>> res = new PriorityQueue<>((a , b) -> b.getValue() - a.getValue()) ;

        res.addAll(map.entrySet()); 

        StringBuilder sb = new StringBuilder() ;

        while(!res.isEmpty()){

            Map.Entry<Character,Integer> mp = res.poll() ; 

            for(int i = 0 ; i < mp.getValue() ; i++){

                sb.append(mp.getKey()) ;
            }
        }
        return sb.toString() ;
    }
}