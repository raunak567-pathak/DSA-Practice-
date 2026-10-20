class Solution {
    public int minTimeToType(String word) {
        
        int prev = 'a' ;
        int count = 0 ;

        for(int i = 0 ; i < word.length() ; i++){

            char curr = word.charAt(i) ;

            int diff = Math.abs(curr - prev );

            count += Math.min(diff , 26 - diff ) +  1;
            prev = curr ;
        }
        return count ;
    }
}