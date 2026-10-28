class Solution {
    public int minAllOneMultiple(int k) {
        
        int count =  k ;

        if(count % 2 == 0 || count % 5 == 0 ){
            return -1;
        }

        int rem  = 0 ;

        for(int i = 1 ; i <= count ; i++){

            rem = (rem * 10 +  1) % count ;

            if(rem == 0){
                return i ;
            }
        }
        return -1;
    }
}