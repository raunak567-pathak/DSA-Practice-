class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int ones = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }
        int zero = 0 ;
        int max = 0 ;

        for(int i = 0 ; i < n - 1 ; i ++){
            if(s.charAt(i) == '0'){
                zero++;
            }else{
                ones--;
            }
            max = Math.max(max , ones + zero);
        }
        return max ;
    }
}