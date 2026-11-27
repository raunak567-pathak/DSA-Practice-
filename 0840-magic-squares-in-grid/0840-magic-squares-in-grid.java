class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        

        int m = grid.length ;
        int n = grid[0].length ;
        int count = 0 ;

        for(int i = 0 ; i <= m - 3 ; i++){
            for(int j = 0 ; j <= n - 3 ; j++){

                if(dfs(grid , i , j )){
                    count++;
                }
            }
        }
        return count ;
    }

    boolean dfs(int [][] grid , int i , int j ){

        if(grid[i + 1][j + 1] != 5 )return false ;

        int [] count = new int [16] ;

        for(int k = i ; k < i + 3 ; k++){
            for(int l = j ; l < j + 3 ; l++){

                int val = grid[k][l] ;

                if(val < 1 || val > 9 || count[val] > 0)return false ;
                count[val]++;
            }
        }

        if(grid[i][j] + grid[i][j+1] + grid[i][j+2] != 15)return false ;
        if(grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j + 2] != 15)return false ;
        if(grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2] != 15)return false ;



         if(grid[i][j] + grid[i+1][j] + grid[i+2][j] != 15)return false ;
        if(grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j + 1] != 15)return false ;
        if(grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2] != 15)return false ;

        if(grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] != 15)return false ;
        if(grid[i][j+2] + grid[i + 1][j + 1 ] + grid[i + 2][j] != 15 )return false ;

        return true ;

    }
}