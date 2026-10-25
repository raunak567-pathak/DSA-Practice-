class Solution {
    public boolean judgeCircle(String moves) {
        
        int up = 0 ;
        int down = 0 ;

        for(char c : moves.toCharArray()){

            if( c == 'U')
            up++;
            else if(c == 'D')
            up--;
            else if(c == 'R')
            down++;
            else if(c == 'L')
            down--;
        }
        return (up == 0 && down == 0) ;
    }
}