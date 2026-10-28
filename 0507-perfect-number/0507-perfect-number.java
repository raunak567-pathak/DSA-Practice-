class Solution {
    public boolean checkPerfectNumber(int num) {
        

        int sum = 0 ;

        for(int i = 1 ; i < Math.sqrt(num) ; i++){

            if(num % i == 0){

                if(i != num / i ){

                    sum += i ;

                    sum += num / i ;
                }else{

                    sum += i ;
                }
            }
        }
        if((sum - num) == num ){
            return true ;
        }else{

            return false ;
        }
    }
}