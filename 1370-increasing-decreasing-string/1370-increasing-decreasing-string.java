class Solution {
    public String sortString(String s) {
        
        int [] chars = new int [26];

        for(char c : s.toCharArray()){
            chars[c - 'a']++;
        }


        StringBuilder res = new StringBuilder() ;

        while(res.length() < s.length()){

            for(int i = 0 ; i < 26 ; i++){

                if(chars[i] != 0){

                    res.append((char)(i + 'a')) ;
                    chars[i]--;
                }
            }

            for(int i = 25 ; i >= 0 ; i--){

                if(chars[i] != 0){

                    res.append((char)(i + 'a'));
                    chars[i]--;
                }
            }
        }
        return res.toString(); 
    }
}