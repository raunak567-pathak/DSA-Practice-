class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int count = 0 ;
        int res = 0 ; 
        int i = 0 ;
        int j = tokens.length - 1 ;

        while(i <= j){
            if(power >= tokens[i]){
                power -= tokens[i];
                i++;
                count++;
                res = Math.max(res , count);
            }else if(count > 0){
                power += tokens[j];
                j--;
                count--;
            }else{
                break ;
            }
        }
        return res ;
    }
}