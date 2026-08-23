class Solution {
    public long minimumSteps(String s) {
     int n = s.length()   ;
     long zero = 0;
     long count = 0 ;
     for(int i = 0 ; i < n ; i++){
        char c = s.charAt(i);
        if(c == '0'){
            zero += count;
        }else{
            count += 1;
        }
     }
     return zero;
    }
}