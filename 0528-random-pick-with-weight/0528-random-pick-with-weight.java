class Solution {
int [] w ; 

int total ;
    public Solution(int[] w) {
        
        this.w = w ;

        for(int ww : w ){

            total += ww ;
        }
    }
    
    public int pickIndex() {
        
        double target = total * Math.random() ;

        int curr = 0 ;

        for(int i = 0 ; i < w.length ; i++){

            curr += w[i];

            if(curr > target){

                return i ;
            }
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */