class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int m = rowSum.length ;
        int n = colSum.length ;

        int [][] matrix = new int [m][n] ;

        for(int i = 0   ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                int val = Math.min(rowSum[i] , colSum[j]) ;

                matrix[i][j] = val ;

                rowSum[i] -= val ;
                colSum[j] -= val ;

                if(rowSum[i] == 0)break ;
            }
        }
        return matrix ;
    }
}