class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE ; 
        }
        if(dividend == divisor) return 1 ;

        boolean sign = true ;

        if(dividend >= 0 && divisor < 0)sign = false;
        if(dividend < 0 && divisor > 0)sign = false ;

        long m = Math.abs((long)dividend) ;
        long n = Math.abs((long)divisor) ;


         int ans = 0 ; 
     while(m >= n ){

        long count = 0 ;

        while(m >= (n << (count + 1 ))){

            count++ ;
        }
            ans += (1L << count ) ;

            m = m - ( n << count ) ;
        }

        if(ans > Integer.MAX_VALUE )
             {
        return sign ?  Integer.MAX_VALUE : Integer.MIN_VALUE ; 

             }
        return sign ? (int) ans : (int) -ans;
    }
}