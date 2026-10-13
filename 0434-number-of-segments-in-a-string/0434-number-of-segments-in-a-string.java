class Solution {
    public int countSegments(String s) {
        int count = 0 ;

        char [] res  = s.toCharArray() ;

        for(int i = 0 ; i  < res.length ; i++){
            if(res[i] != ' ')count++;
            while(i < res.length && res[i] != ' ')i++;
        }
        return count ;
    }
}