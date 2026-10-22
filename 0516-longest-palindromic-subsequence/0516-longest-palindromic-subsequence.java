class Solution {
    public int longestPalindromeSubseq(String s) {
        
        StringBuilder sb = new StringBuilder(s) ;

        String res = sb.reverse().toString() ;

        return lcs(s , res) ;
    }

    public int lcs(String a , String b){

        int m = a.length();
        int n = b.length() ;

        int [][] dp = new int[m + 1][n + 1 ];

        for(int i = 0 ; i < m + 1 ; i++){
            for(int j = 0 ; j < n + 1 ; j++){

                if(i == 0 || j == 0)dp[i][j] = 0 ;

                else if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1] ;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}