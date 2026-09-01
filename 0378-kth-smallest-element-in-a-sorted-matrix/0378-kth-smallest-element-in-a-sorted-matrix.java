class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      int m = matrix.length ;
      int []   arr  = new int [m * m];

      int index = 0 ;

      for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < m ; j++){
            arr[index++] = matrix[i][j];
        }
      }
      Arrays.sort(arr);
      return arr[k-1];
    }
}