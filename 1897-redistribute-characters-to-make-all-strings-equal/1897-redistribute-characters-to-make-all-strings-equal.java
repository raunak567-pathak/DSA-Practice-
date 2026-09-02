class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        for(String w : words){
            for(char  c : w.toCharArray()){
            map.put(c , map.getOrDefault(c , 0) + 1) ;
        }
        }
        for(int count : map.values()){
            if(count % words.length != 0){
                return false;
            }
        }
        return true;
    }
}