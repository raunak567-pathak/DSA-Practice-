class Solution {
    public int minimumFlips(int n) {

       String s = Integer.toBinaryString(n)  ;

       int m = s.length() ;
       int count = 0 ;

       for(int i = 0 ; i < m ; i++){
        
        if(s.charAt(i) != s.charAt(m - i - 1 )){

            count++;
        }
       }
       return count ;
    }
}