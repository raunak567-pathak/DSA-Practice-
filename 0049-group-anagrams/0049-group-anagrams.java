class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();

        for(String w : strs){

            char [] c = w.toCharArray() ;

            Arrays.sort(c);

            String res = new String(c) ;

            if(!map.containsKey(res)){

                map.put(res , new ArrayList<>()) ;
            }
            map.get(res).add(w);
        }
        return new ArrayList<>(map.values()) ;
    }
}