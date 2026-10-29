class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        
        int n = words.length ;

        int count = 0 ;

        String vowel = "AEIOUaeiou" ;

        for(int i = left ; i <= right ; i++){

            String w = words[i] ;

            if(vowel.indexOf(w.charAt(0)) != -1 && vowel.indexOf(w.charAt(w.length() - 1 )) != -1){

                count++;
            }
        }
        return count ;
    }
}