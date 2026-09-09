class Solution {
    public boolean scoreBalance(String s) {
        int count = 0 ;

        for(char c : s.toCharArray())count += c - 'a' + 1 ;

        int pre = 0 ;

        for(char c : s.toCharArray()){
            pre += c - 'a' + 1 ;

        if(2 * pre == count )return true ;
        }
        return false ; 
    }
}