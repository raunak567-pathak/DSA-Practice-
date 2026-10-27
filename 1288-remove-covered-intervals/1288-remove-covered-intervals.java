class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        Arrays.sort(intervals , (a , b) -> {
            if(a[0] == b[0])return b[1] - a[1] ;
            return a[0] - b[0];
        });

        int count = 0 ;
        int prev = 0 ;
        int n = intervals.length ;

        for(int i = 0 ; i < n ; i++){

            int start = intervals[i][0] ;
            int end = intervals[i][1];

            if(end <= prev){

                count++;
            }else{
                prev = end ;
            }
        }
        return n - count ;
    }
}