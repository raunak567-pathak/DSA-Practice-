class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for(int i = 2 ; i <= n - 1; i++){
            if(!helper(Integer.toString(n , i))){
                return false ;
            }
        }
        return true ;
    }

    boolean helper(String n){
        int left = 0;
        int right = n.length() - 1 ;

        while(left <= right){

            if(n.charAt(left) != n.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true ;
    }
}