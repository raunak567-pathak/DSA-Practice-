class Solution {
    public int maxFreqSum(String s) {
        int [] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        int max = 0 ;
        int maxx = 0 ;

        for(int i = 0 ; i < 26 ; i++){

            char curr = (char)(i + 'a');

            if(isVowel(curr)){
                max = Math.max(max , freq[i]);
            }else{
                maxx = Math.max(maxx , freq[i]);
            }
        }
        return max + maxx ;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' ||  c == 'o' || c == 'u';
    }
}