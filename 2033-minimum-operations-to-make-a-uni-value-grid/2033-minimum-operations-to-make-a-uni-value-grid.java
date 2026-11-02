class Solution {
    public int minOperations(int[][] grid, int x) {
        
        int m = grid.length ;
        int n = grid[0].length ;

        int [] arr = new int [m * n ] ;
        int idx = 0 ;

        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[idx++] = grid[i][j] ;
            }
        }

        Arrays.sort(arr) ;
        long count = 0 ;

        int median = arr[arr.length / 2 ] ;

        for(int num : arr){

            if(num == median){
                continue ;
            }

            if(Math.abs(num - median) % x != 0){
                return -1;
            }

            count += (Math.abs(num - median) / x ) ;
        }
        return (int)count ;
    }
}