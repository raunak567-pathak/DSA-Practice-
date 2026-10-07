class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>() ;
        String [] arr1 = s1.split(" ") ;

        for(String w : arr1){
            map.put(w , map.getOrDefault(w , 0) + 1 );
        }

        String [] arr2 = s2.split(" ") ;

        for(String w : arr2){
            map.put(w , map.getOrDefault(w , 0) + 1 );
        }

        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> mp : map.entrySet()){
            if(mp.getValue() == 1){
                list.add(mp.getKey());
            }
        }
        return list.toArray(new String[0]);
    }
}