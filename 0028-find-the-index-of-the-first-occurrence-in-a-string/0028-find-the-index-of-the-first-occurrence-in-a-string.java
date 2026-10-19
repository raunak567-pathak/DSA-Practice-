class Solution {
    public int strStr(String haystack, String needle) {
        
        int n = haystack.length() ;
        int k = needle.length() ;

        for(int i = 0 ; i <= n  - k ; i++){

            if(isSub(haystack , needle , i , i + k )) {

                return i ;
            }
        }
        return -1 ;
    }

    public boolean isSub(String haystack , String needle , int start , int end ){

        for(int i = start , j = 0 ; i < end ; i++ , j++){

            if(haystack.charAt(i) != needle.charAt(j)){
                return false;
            }
        }
        return true ;
    }
}