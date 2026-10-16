class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        int n = heights.length ;

        PriorityQueue<Integer> q = new PriorityQueue<>() ;

        for(int i =  0 ; i < n - 1 ; i++) {

            int diff = heights[i + 1 ] - heights[i] ;

            if(  diff > 0 ){

                q.add(diff);


                if(q.size() > ladders){

                    bricks -= q.poll() ;
                }

                if(bricks < 0){
                    return i ;
                }
            }
        }
        return n - 1 ;
    }
}