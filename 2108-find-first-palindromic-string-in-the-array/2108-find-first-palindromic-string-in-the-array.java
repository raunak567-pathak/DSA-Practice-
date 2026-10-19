class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String w : words){

            if(isPal(w)){
                return w ;
            }
        }
        return "" ;
    }

    boolean isPal(String s){
        int left =  0 ;
        int right = s.length() - 1 ;

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true ;
    }
}