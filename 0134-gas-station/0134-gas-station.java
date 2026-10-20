class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int count = 0 ;
        int sum = 0 ;
        int total = 0 ;

        for(int i = 0 ; i < gas.length ; i++){

            sum += gas[i] - cost[i] ;

            if(sum < 0 ){

                total += sum ;
                sum = 0 ;
                count = i + 1 ;
            }
        }
        total += sum ;
        return total >= 0 ? count : -1 ;
    }
}