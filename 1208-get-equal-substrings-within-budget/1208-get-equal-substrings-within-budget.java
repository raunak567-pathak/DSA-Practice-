class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int j = 0 ;
        int count = 0 ;
        int max = 0 ;

        for(int i = 0 ; i < s.length(); i++){

            count += Math.abs(s.charAt(i) - t.charAt(i));

            while(count > maxCost){

                count -= Math.abs(s.charAt(j) - t.charAt(j)) ;
                j++;
            }
            max = Math.max(max , i - j + 1 );
        }
        return max ;
    }
}