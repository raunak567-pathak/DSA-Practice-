class Solution {
    public int residuePrefixes(String s) {
        
        int count = 0 ;
        int n = s.length() ;

        for(int i = 1 ; i <= n ; i++){

            String pre = s.substring(0 , i ) ;

            Set<Character> set = new HashSet<>() ;
            for(char c : pre.toCharArray()){

                set.add(c) ;
            }

            if(set.size() == (i %  3 )){
                count++;
            }
        }
        return count ;
    }
}