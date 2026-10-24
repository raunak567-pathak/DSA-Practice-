class Solution {
    public int arrangeCoins(int n) {
        
        long left = 0 ;
        long right = n ;

        while(left <= right){

            long mid = left + ((right - left) >> 1 );
            long coinused =   mid  * ( mid + 1 )  /  2;

            if(n == coinused){
                return (int)mid ;
            }else if(n < coinused){

                right = mid -  1;
            }else{
                left = mid + 1 ;
            }
        }
        return (int)right ; 
    }
}