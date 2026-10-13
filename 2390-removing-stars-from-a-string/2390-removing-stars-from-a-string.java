class Solution {
    public String removeStars(String s) {
        char [] arr  = s.toCharArray() ;
        int j = 0 ;
        for(int i = 0 ; i < s.length() ;  i++)
            if(s.charAt(i) == '*' )
                j--;
            else
                arr[j++] = arr[i];
        return new String(arr , 0  , j) ;
    }
}