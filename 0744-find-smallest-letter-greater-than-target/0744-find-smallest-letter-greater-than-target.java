class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length ;
        char small = letters[0];

        for(int i = 0 ; i < n ; i++){

            if(letters[i] > target){

                small = letters[i] ;
                break ;
            }
        }
        return small ;
    }
}