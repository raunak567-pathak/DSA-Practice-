class Solution {
    public String largestMerge(String word1, String word2) {
        
        StringBuilder res = new StringBuilder() ;

        int i = 0 ;
        int j = 0 ;

        char [] w1 = word1.toCharArray() ; 
        char [] w2 = word2.toCharArray() ;

        int n1 = w1.length ;
        int n2 = w2.length ;

        while(i < n1 && j < n2){

            if(w1[i] == w2[j]){

                if(helper(w1  , i , w2 , j)){

                    res.append(w1[i++]);
                }else{
                    res.append(w2[j++]) ;
                }
            }else if(w1[i] > w2[j]){
                res.append(w1[i++]);
            }else{
                res.append(w2[j++]);
            }
        }
        res.append(word1.substring(i)) ;
        res.append(word2.substring(j));
        return res.toString();
    }

    boolean helper(char [] w1 , int i , char [] w2 , int j){

        while(i < w1.length && j < w2.length ) {

            if(w1[i] == w2[j]){
                i++;
                j++;
            }else if(w1[i] > w2[j]){

                return true ;
            }else{
                return false;
            }
        }
        if(i  < w1.length){

            return true ;
        }
        return false; 
    }
}