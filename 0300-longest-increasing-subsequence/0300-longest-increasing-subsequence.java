class Solution {
    public int lengthOfLIS(int[] nums) {
        

        Stack<Integer> stack = new Stack<>() ;

        for(int num : nums){
            if(stack.isEmpty() || stack.get(stack.size() - 1) < num){
                stack.push(num);
            }else{

                int left = 0 ;
                int right = stack.size() - 1 ;

                while(left <= right){

                    int mid = left + (right - left) / 2 ;

                    if(stack.get(mid) >= num){

                        right = mid - 1 ;
                    }else{
                        left = mid + 1 ;
                    }
                }
                stack.set(left , num ) ;
            }
        }
        return stack.size()  ;
    }
}