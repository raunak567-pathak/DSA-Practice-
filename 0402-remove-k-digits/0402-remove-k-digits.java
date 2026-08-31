class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>() ;

        for(char c : num.toCharArray()){

            while(!stack.isEmpty() && k > 0 && stack.peek() > c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(k > 0){
            stack.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();

        for(char d : stack){
            res.append(d);
        }

        while(res.length() > 0 && res.charAt(0) == '0'){
            res.deleteCharAt(0);
        }
        return res.length() == 0 ? "0" : res.toString() ;
    }
}