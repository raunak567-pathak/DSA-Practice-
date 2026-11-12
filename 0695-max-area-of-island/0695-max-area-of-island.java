class Solution {
    int [][] dirc = {{1 , 0 } , {-1 , 0 } , {0 , 1 } , {0 , -1}};
    public int maxAreaOfIsland(int[][] grid) {
        
        int m = grid.length ;
        int n = grid[0].length ;

        int area =  0 ;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                if(grid[i][j] == 1 ){

                    area = Math.max(area , dfs(grid , i , j));
                }
            }
        }
        return area ;
    }

    int dfs(int [][] grid , int i , int j){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0){

            return 0 ;
        }

        grid[i][j] = 0 ;

        int count = 1 ;

        for(int [] d : dirc){

            int nr = i + d[0];
            int nc = j + d[1] ;

            int countnext = dfs(grid , nr , nc);

            count  = count + countnext ;
        }
        return count ;
    }
}