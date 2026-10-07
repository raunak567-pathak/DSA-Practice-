class Solution {
    public int mySqrt(int x) {
        
        long left = 1 ;
        long right = x ;
        long ans = 0 ;

        while(left <= right){

            long mid = (right + left) / 2 ;

            if((long)mid * mid == x){
                return (int)mid ;
            }else if((long)mid * mid  < x){ 
                left = mid + 1 ;
                ans = mid ;
            }else{
                right = mid - 1 ;
            }
        }
        return (int)ans ;
    }
}