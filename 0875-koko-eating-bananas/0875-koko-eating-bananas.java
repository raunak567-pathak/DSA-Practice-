class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left =  1 ;
        int right = piles[0] ;

        for(int num : piles){
            right = Math.max(num , right);
        }
        int res = right ;

        while(left <= right){

            int mid = (left + right) / 2 ; 

            long time = 0 ;

            for(int p : piles){

                time += Math.ceil((double)p / mid);
            }

            if(time <= h){
                res = mid ;
                right = mid - 1 ;
            }else{
                left = mid +  1 ;
            }
        }
        return left ;
    }
}