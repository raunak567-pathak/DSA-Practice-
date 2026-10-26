class Solution {
    public int countIslands(int[][] grid, int k) {
        
        int m = grid.length ;
        int n = grid[0].length ;
        int count = 0 ;

        int [][] dirc = {{1 , 0 } , {-1 , 0} , {0 , 1 } , {0 , -1}} ;

        for(int i = 0 ; i  < m ; i++){
            for(int j = 0 ; j < n ; j++){


                if(grid[i][j] > 0){

                    long sum = 0 ;

                    Queue<int[]> q =  new LinkedList<>() ;

                    q.offer(new int []{i , j}) ;

                    sum += grid[i][j]; 
                    grid[i][j] = 0 ;


                    while(!q.isEmpty()){

                        int [] cell = q.poll() ;

                        int r1 = cell[0] ;
                        int r2 = cell[1] ;

                        for(int [] d : dirc){

                            int nr = r1 + d[0] ;
                            int nc = r2 + d[1] ;

                            while(nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] > 0){

                                sum += grid[nr][nc] ;

                                q.offer(new int [] {nr , nc });

                                grid[nr][nc] = 0 ;
                            }
                        }
                    }

                    if(sum % k  == 0)count++;
                }
            }
        }
        return count ;
    }
}