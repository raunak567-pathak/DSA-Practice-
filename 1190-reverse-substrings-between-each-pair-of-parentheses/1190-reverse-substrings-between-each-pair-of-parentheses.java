class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();

        stack.push(new StringBuilder());

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(new StringBuilder());
            }else if( c == ')'){
                StringBuilder res = stack.pop().reverse();
                stack.peek().append(res);
            }else{
                stack.peek().append(c);
            }
        }
        Collections.reverse(stack);
        return stack.pop().toString();
    }
}