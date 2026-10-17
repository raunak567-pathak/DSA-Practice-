class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>() ;
        for(String c : operations){

            if(c.equals("+")){

                int top = stack.pop() ;
                int newTop = top + stack.peek() ;
                stack.push(top) ;
                stack.push(newTop);
            }else if(c.equals("D")){
                stack.push(2 * stack.peek()) ;
            }else if(c.equals("C")){
                stack.pop() ;
            }else{
                stack.push(Integer.parseInt(c)) ;
            }
        }
        int sum = 0 ;

        for(int score : stack){

            sum += score ;
        }
        return sum ;
    }
}