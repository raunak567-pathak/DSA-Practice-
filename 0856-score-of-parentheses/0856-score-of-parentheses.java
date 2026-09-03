class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();

        int count = 0 ;

        for(int i = 0 ; i  < s.length() ; i++){

            if(s.charAt(i) == '('){
                stack.push(count);
                count = 0 ;
            }else{
                count = Math.max(2 * count , 1) + stack.pop();
            }
        }
        return count;
    }
}