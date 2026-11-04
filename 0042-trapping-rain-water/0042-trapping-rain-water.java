class Solution {
    public int trap(int[] height) {
        

        int i = 0 ;

        int j = height.length - 1 ;

        int first = 0 ;

        int second = 0 ;

        int count = 0 ;

        while(i < j){

            first = Math.max(first , height[i]) ;

            second = Math.max(second , height[j]) ;

            if(first < second){

                count += first - height[i] ;
                i++;
            }else{

                count += second - height[j];
                j--;
            }
        }
        return count ;
    }
}