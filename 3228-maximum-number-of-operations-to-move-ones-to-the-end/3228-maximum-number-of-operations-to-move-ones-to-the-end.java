class Solution {
    public int maxOperations(String s) {
        
        int count = 0 ;

        int i = s.length() - 1 ;

        int ans = 0 ;

         while(i >= 0 ){

            char c = s.charAt(i) ;

            if(c == '0'){

                count++ ;

                while(i >= 0 && s.charAt(i) == '0'){
                    i--;
                }
            }else{
                ans += count ;
                i--;
            }
         }
         return ans ;
    }
}