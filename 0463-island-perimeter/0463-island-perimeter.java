class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int m = grid.length ;
        int n = grid[0].length ;

        int land = 0 , shared = 0 ;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                if(grid[i][j] == 1){
                    land++;

                    if(i < m - 1 && grid[i+1][j] == 1)shared++;
                    if(j < n - 1 && grid[i][j + 1] == 1)shared++;
                }
            }
        }
        return 4 * land - 2 * shared ;
    }
}