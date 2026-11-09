class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int j = 0 ;

        int count = 0 ;

        int satisfied = 0 ;

        int max = 0 ;

        int n = customers.length ; 

        for(int i = 0 ; i < n ; i++){

            if(grumpy[i] == 1 ){

                count += customers[i] ;

            } else {

                satisfied  +=  customers[i] ;

            }

            if(i - j  + 1 > minutes){

                if(grumpy[j] == 1 ){

                    count -= customers[j];
                }
                j++;
            }

            max = Math.max(max , count );
        }

        return max + satisfied ;
    }
}