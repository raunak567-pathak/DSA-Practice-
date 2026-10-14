class Solution {
    public long maxMatrixSum(int[][] matrix) {
        
        long sum = 0 ;
        int min = Integer.MAX_VALUE  ;
        int count = 0 ;

        for(int i = 0 ; i <  matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){

                int val = matrix[i][j] ;

                sum += Math.abs(val) ;

                if(val < 0)count++;

                min = Math.min(min , Math.abs(val));
            }
        }
        if(count  % 2 != 0){

            return sum - 2L * min ;
        }
        return sum ;
    }
}