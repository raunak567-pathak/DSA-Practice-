class Solution {
    public int characterReplacement(String s, int k) {
        
        int [] count = new int [26];
        int j = 0 ;
        int max = 0 ;
        int longest = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            count[s.charAt(i) - 'A']++;
            longest = Math.max(longest , count[s.charAt(i) - 'A']);

            if((i - j + 1) - longest > k){

                count[s.charAt(j) - 'A']--;
                j++;
            }
            max = Math.max(max , i - j + 1);
        }
        return max ;
    }
}