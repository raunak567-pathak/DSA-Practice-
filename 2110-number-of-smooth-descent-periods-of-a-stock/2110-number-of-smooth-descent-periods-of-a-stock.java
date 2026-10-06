class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 0 ;
        int count = 0 ;
        int prev = -1;

        for(int num : prices){

            if(prev - num == 1){
                count++;
            }else{
                count = 1 ;
            }
            ans += count ;
            prev = num ;
        }
    return ans ;
    }
}