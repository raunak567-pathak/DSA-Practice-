class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length ;

        Stack<Integer> stack = new Stack<>() ;
        int max = 0 ;

        for(int i = 0 ; i <= n ; i++){

        int curr ;

        if(i == n){
            curr = 0 ;
        }else{
            curr = heights[i];
        }

        while(!stack.isEmpty() && curr < heights[stack.peek()]){

            int height = heights[stack.pop()] ;
            int right = i ;
            int left ;

            if(stack.isEmpty()){

                left = -1 ;
            }else{
                left = stack.peek();
            }

            int width = right - left - 1 ;

            int area = height * width ;

            max = Math.max(max , area );
        }
        stack.push(i);
        }
        return max ;
    }
}