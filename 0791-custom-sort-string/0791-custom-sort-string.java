class Solution {
    public String customSortString(String order, String s) {
        StringBuilder res = new StringBuilder();
        
        int [] freq = new int [26];

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(char c : order.toCharArray()){
            while(freq[c - 'a'] > 0){
                res.append(c);
                freq[c - 'a']--;
            }
        }
     for(int i = 0 ; i < 26 ; i++)   {
        while(freq[i] > 0){
            res.append((char)(i + 'a'));
            freq[i]--;
        }
     }
     return res.toString();
    }
}