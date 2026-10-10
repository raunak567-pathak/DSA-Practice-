class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        
        int count = 0 ;

        List<String> list = new ArrayList<>() ;

        for(String w : words){
            for(String prev : list){
                if(w.startsWith(prev) && w.endsWith(prev)){
                    count++;
                }
            }
            list.add(w);
        }
        return count ;
    }
}