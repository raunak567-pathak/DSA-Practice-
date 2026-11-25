class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder sb = new StringBuilder() ;

        while(columnNumber > 0){

            int index = (columnNumber - 1 ) % 26 ;

            sb.insert(0 , (char)('A' + index )) ;

            columnNumber = (columnNumber - 1 ) / 26 ; 

        }

        return sb.toString() ;
    }
}