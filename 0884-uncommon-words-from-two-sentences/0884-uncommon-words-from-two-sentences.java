class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        String [] words1 = s1.split(" ");
        for(String w : words1){
            map.put(w , map.getOrDefault(w , 0) + 1);
        }
        String [] words2 = s2.split(" ");
        for(String w : words2){
            map.put(w , map.getOrDefault(w , 0) + 1);
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