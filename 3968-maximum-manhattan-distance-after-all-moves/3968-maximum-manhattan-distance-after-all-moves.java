class Solution {
    public int maxDistance(String moves) {
        
        int  x = 0 ;
        int y = 0 ;
        int count = 0 ;

        for(char c : moves.toCharArray()){

            if(c == 'U')x++;
            else if(c == 'D')x--;
            else if(c == 'L')y++;
            else if(c == 'R')y--;

            else count++;
        }

        return Math.abs(x) + Math.abs(y) + count ;
    }
}