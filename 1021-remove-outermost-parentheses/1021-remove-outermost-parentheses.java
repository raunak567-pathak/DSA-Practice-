class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder res = new StringBuilder();
        int ob = 0 ;

        for(char c : s.toCharArray()){
            if(c == '('){

                if(ob > 0){
                    res.append(c);
                }
                ob++;
            }else if(c == ')'){
                ob--;
                if(ob > 0){
                    res.append(c);
                }
            }
        }
        return res.toString() ;
    }
}