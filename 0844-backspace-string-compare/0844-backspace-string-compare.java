class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> stacks = new Stack<>() ;
        Stack<Character> stackt = new Stack<>() ;

        for(char c : s.toCharArray()){

            if(c != '#'){
                stacks.push(c) ;
            }else if(!stacks.isEmpty()){
                stacks.pop() ;
            }
        }

        for(char c : t.toCharArray()){

            if(c != '#'){
                stackt.push(c) ;
            }else if(!stackt.isEmpty()){
                stackt.pop();
            }
        }
        return stacks.equals(stackt) ;
    }
}