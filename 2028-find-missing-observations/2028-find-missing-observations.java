class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int m = rolls.length ;

        int total = mean * ( m + n ) ;

        int sum = 0 ;

        for(int num : rolls){

            sum += num ;
        }

        int missing = total - sum  ;

        if(missing < n || missing > 6 * n ){

            return new int[0] ;
        }

        int [] ans = new int [n] ;

        int base = missing / n ;
        int extra = missing % n ;

        for(int i = 0 ; i < n ; i++){

            ans[i] = base ;


            if(i < extra){

                ans[i] = ans[i] +  1;
            }
        }
        return ans ;
    }
}