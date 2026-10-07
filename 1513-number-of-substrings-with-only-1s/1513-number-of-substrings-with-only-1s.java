class Solution {
    public int numSub(String s) {
        
        long count = 0 ;
        long res = 0 ;
        long mod = 1000000007; 


        for(char c : s.toCharArray()){

            if(c == '1'){
                count++;
            }else{

                res = (res + (count * ( count + 1 ) / 2 ) % mod) % mod ;
                count = 0 ;
            }
        }
        if(count > 0 ){
            res = (res + (count * ( count + 1 ) / 2 ) % mod) % mod;
        }
        return (int) res ;
    }
}