class Solution {
    public int countBinarySubstrings(String s) {
        int count = 1 , prev = 0 , ans = 0 ;

        for(int i = 1 ; i < s.length() ; i++)

            if(s.charAt(i) == s.charAt(i-1))count++;
            else{
                ans += Math.min(count , prev);
                prev = count ;
                count = 1 ;
        }
        return ans += Math.min(count , prev );
    }
}