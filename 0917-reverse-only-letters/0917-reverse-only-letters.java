class Solution {
    public String reverseOnlyLetters(String s) {
        

        char [] res = s.toCharArray() ;
        int i = 0 ; 
        int j = s.length() - 1 ;

        while(i < j){

            while(i < j && !Character.isLetter(res[i]))i++;
            while(i < j && !Character.isLetter(res[j]))j--;

            char temp = res[i] ;
            res[i] = res[j] ;
            res[j] = temp;
            i++;
            j--;
        }
        return new String(res) ;
    }
}