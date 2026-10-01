class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        

        int m = grid.length ;

        int [] res = new int [m * m + 1];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0  ; j < m ; j++){

                res[grid[i][j]]++;
            }
        }
        int rep = -1 ;
        int mis  = -1 ;

        for(int i = 1 ; i <= m * m ; i++){

            if(res[i] == 0) {
                mis = i ;
            }else if(res[i] == 2){
                rep = i ;
            }
        }
        return new int [] {rep , mis} ;
    }
}