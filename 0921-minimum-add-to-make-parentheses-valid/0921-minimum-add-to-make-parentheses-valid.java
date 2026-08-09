class Solution {
    public int minAddToMakeValid(String s) {
       int ob = 0 , cb = 0 ;
       for(char c : s.toCharArray()) {
        if(c == '('){
            ob++;
        }else{
            if(ob > 0){
                ob--;
            }else{
                cb++;
            }
        }
       }
       return ob + cb;
    }
}