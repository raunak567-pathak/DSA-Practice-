class Solution {
    public String minRemoveToMakeValid(String s) {
        
        int ob = 0 , cb = 0 ; 

        for(char c : s.toCharArray()){
            if( c == ')'){
                cb++;
            }
        }
        StringBuilder res = new StringBuilder() ;
        for(char c  : s.toCharArray()){
            if( c == '('){
                if(ob == cb)continue ;
                ob++;
            }else if(c == ')'){
                cb--;
                if(ob == 0)continue ;
                ob--;
            }
            res.append(c);
        }
        return res.toString() ;
    }
}