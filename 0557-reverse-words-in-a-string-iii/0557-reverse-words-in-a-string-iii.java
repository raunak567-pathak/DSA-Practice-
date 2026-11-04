class Solution {
    public String reverseWords(String s) {
        
        String [] word = s.split(" ") ;

        StringBuilder res = new StringBuilder() ;
        for(String w : word){

            res.append(new StringBuilder(w).reverse()).append(" ");
        }
        return res.toString().trim() ;
    }
}