class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int index = 0 ;

        int n = s.length();

        for(int i = 0; i < n ; i++){

            if(index < spaces.length && i == spaces[index]){
                res.append(' ');
                index++;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}