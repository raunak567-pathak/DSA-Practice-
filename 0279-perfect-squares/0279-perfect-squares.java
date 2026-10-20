class Solution {
    public int numSquares(int n) {
        
        for(int i = 1 ; i * i <= n ; i++){
            if(i * i == n)return 1 ;
        }

        for(int i = 1 ; i * i <= n ; i++){
            for(int j = 1 ; j * j <= n ; j++){
                if(i * i + j * j == n)return 2 ;
            }
        }
        for(int i = 1 ; i * i <= n ; i++){
            for(int j = 1 ; j * j <= n ; j++){
                int rem = n - i * i - j * j ;
                int k = (int)Math.sqrt(rem) ;

                if(rem == k * k)return 3 ;
            }
        }
        return 4 ;
    }
}