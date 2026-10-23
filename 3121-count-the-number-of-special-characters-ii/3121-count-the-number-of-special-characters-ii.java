class Solution {
    public int numberOfSpecialChars(String word) {
        

        int [] a  = new int [26 ];
        int [] b = new int [26] ;

        Arrays.fill(a , -1) ;
        Arrays.fill(b , -1) ;

        for(int i = 0 ; i < word.length() ; i++){

            char c = word.charAt(i);

            if(c >= 'a' && c <= 'z'){

                a[c - 'a'] = i ;
            }else{
                if(b[c - 'A'] == -1){
                    b[c - 'A'] = i ;
                }
            }
        }

        int count = 0 ;

        for(int i = 0 ; i < 26 ; i++){

            if(a[i] != -1 && b[i] != -1 && a[i] < b[i]){
                count++;
            }
        }
        return count ;
    }
}