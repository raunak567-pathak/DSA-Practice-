class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {

       int n = happiness.length ;

       long sum = 0 ;

       Arrays.sort(happiness)  ;

       for(int i = 0 ; i < k ; i++){

        int val = happiness[n-i-1] - i ;

        if(val > 0){

            sum += val ;
        }
       }
       return sum ;
    }
}