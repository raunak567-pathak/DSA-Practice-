class Solution {
    public int numSteps(String s) {
        
        int c1= 0 ;
        int c2= 0 ;
        for(int i  = s.length() - 1 ; i >= 1 ; i--){
            int right = s.charAt(i) - '0';
            if((right + c2 ) == 1){
                c2 =  1;
                c1 += 2 ;
            }else{
                c1++;
            }
        }
        return c1 + c2 ;
    }
}