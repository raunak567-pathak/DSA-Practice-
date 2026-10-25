class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length ;

        boolean [] visit = new boolean[n] ;
        int count = 0 ;

        for(int i = 0 ; i < n ; i++){

            if(!visit[i]){

                count++; 

                dfs(i , isConnected , visit) ;
            }
        }
        return count ;
    }
        private void dfs(int node , int [][] isConnected , boolean [] visit) {

            visit[node] = true ;

            for(int i = 0 ; i < isConnected.length ; i++){

                if(isConnected[node][i] == 1 && !visit[i]){

                    dfs(i , isConnected , visit) ;
                }
            }
        }
}