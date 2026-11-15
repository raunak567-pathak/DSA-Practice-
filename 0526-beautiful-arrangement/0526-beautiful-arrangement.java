class Solution {
    int count = 0 ;
    public int countArrangement(int n) {
        

        boolean [] vis = new boolean [n + 1 ] ;

        helper(n , 1 , vis) ;

        return count ;
    }

    private void helper(int n , int pos , boolean [] vis ){

        if(pos > n){
            count++;
            return ;
        }

        for(int i = 1 ; i <= n ; i++){
            if(!vis[i] && (pos % i == 0 || i % pos == 0)){

                vis[i] = true ;

                helper(n ,pos + 1 , vis ) ;

                vis[i] = false ;
            }
        }
    }
}