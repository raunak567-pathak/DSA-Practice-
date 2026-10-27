class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        
        Map<Double,Long> map = new HashMap<>() ;
        long count = 0 ;

        for(int [] A : rectangles){

            double x = A[0] ;
            double y  = A[1] ;


            double div = (double)x / y ;

            if(map.containsKey(div)){

                count += map.get(div);
            }
            map.put(div , map.getOrDefault(div , 0L) + 1) ;
        }
        return count ;
    }
}