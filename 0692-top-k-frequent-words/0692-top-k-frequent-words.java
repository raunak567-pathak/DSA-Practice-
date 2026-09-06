class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();

        for(String w : words){

            map.put(w , map.getOrDefault(w , 0) + 1 );
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list , (w1 , w2 ) -> {

            int freq = map.get(w2) - map.get(w1);

            if(freq == 0){

                return w1.compareTo(w2);
            }
            return freq ;
        } );

        return list.subList(0 , k);
    }
}