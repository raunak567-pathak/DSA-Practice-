class Solution {
    public int balancedStringSplit(String s) {
        
        int count =  0 ;
        int sum = 0 ;

        for(char c : s.toCharArray()){

            if(c == 'R')
            count++;
            else
            count--;
            if(count == 0)
            sum += 1 ;
        }
        return sum ;
    }
}