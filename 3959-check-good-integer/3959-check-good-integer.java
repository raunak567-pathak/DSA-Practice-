class Solution {
    public boolean checkGoodInteger(int n) {
        
        int digit = 0 ;
        int sqre = 0 ;

        while(n > 0 ){

            int d = n % 10 ;

            digit += d ;
            sqre += d * d ;
            n /= 10 ;
        }
        return (sqre - digit ) >= 50 ;
    }
}