class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String [] word = s.split(" ");

        if(word.length != pattern.length()){

return false ;
        }

        Map<Character,String> map = new HashMap<>() ;
        Map<String,Character> mp = new HashMap<>() ;

        
        for(int i = 0 ; i < pattern.length() ; i++){

            char c = pattern.charAt(i) ;
            String w = word[i] ;

            if(!map.containsKey(c)){
                map.put(c , w);
            }

            if(!mp.containsKey(w)) {
                mp.put(w , c);
            }

            if(!map.get(c).equals(w) || !mp.get(w).equals(c)){
                return false ;
            }
        }
        return true ;
    }
}