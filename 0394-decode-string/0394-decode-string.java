class Solution {
    public String decodeString(String s) {
        
        int k = 0 ;

        Stack<Integer> stack = new Stack<>();
        Stack<StringBuilder> st = new Stack<>() ;
        StringBuilder sb = new StringBuilder() ;


        for(char c : s.toCharArray()){

            if(Character.isDigit(c)){

                k = k * 10 + ( c - '0');
            }else if(c == '['){
                stack.push(k);
                st.push(sb);
                sb = new StringBuilder() ;
                k = 0;
            }else if(c == ']'){
                int rep = stack.pop() ;
                StringBuilder prev = st.pop() ;
                for(int i = 0 ; i < rep ; i++){
                    prev.append(sb);
                }
                sb = prev ;
            }else{
                sb.append(c);
            }
        }
        return sb.toString() ;
    }
}