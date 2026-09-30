class Solution {
    public long gridGame(int[][] grid) {
        long sum1 = 0 ;

        for(int num  : grid[0]){

            sum1 += num ;
        }
        long sum2 = 0 ;
        long min = Long.MAX_VALUE ;

        for(int i = 0 ; i < grid[0].length ; i++){

            sum1 -= grid[0][i];

            min = Math.min(min , Math.max(sum1 , sum2));

            sum2 += grid[1][i];
        }
        return min ;
    }
}