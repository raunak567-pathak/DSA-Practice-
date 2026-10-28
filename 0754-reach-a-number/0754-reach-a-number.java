class Solution {
    public int reachNumber(int target) {
        
        int count = 0 ;
        int total = 0 ;

        target = Math.abs(target) ;

    while(total < target || (total - target) % 2 != 0){

        count++;

        total += count ;
    }
    return count ;
    }
}