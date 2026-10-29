class Solution {
    public char kthCharacter(int k) {
        
        int pos = Integer.bitCount(k - 1 );

        return (char)('a' + pos) ;
    }
}