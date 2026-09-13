class Solution {
    public int heightChecker(int[] heights) {
        int count = 0 ;

        int [] res = heights.clone() ;

        Arrays.sort(res);

        for(int i = 0 ; i < heights.length ; i++){

            if(heights[i] != res[i]){
                count++;
            }
        }
        return count ;
    }
}