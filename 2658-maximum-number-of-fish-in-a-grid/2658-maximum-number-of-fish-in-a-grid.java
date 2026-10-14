class Solution {
    public int findMaxFish(int[][] grid) {
        
        int m = grid.length ;
        int n = grid[0].length ;
        int max = 0 ;

        for(int i = 0 ;  i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                if(grid[i][j] > 0){
                    max = Math.max(max , dfs(grid ,i , j , m , n ));
                }
            }
        }
        return max ;
    }

    int dfs(int [][]grid , int r , int c , int m , int n){
        if(r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == 0){
            return 0 ;
        }

        int count = grid[r][c];
        grid[r][c] = 0 ;

        count += dfs(grid , r + 1 , c , m , n );
        count += dfs(grid , r - 1 , c , m , n );
        count += dfs(grid , r , c + 1 , m , n );
        count += dfs(grid , r , c - 1 , m , n );
        return count ;
    }
}