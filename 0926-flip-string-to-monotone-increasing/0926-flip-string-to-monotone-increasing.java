class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length() ; 
        int count = 0 ;
        int max = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '0')count = Math.min(max , count + 1);
            else max++;
        }
        return count ;
    }
}