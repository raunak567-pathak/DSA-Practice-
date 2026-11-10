class Solution {
    public boolean checkDistances(String s, int[] distance) {
        

        int n = distance.length ;

        for(int i = 0 ; i < n ; i++){

            char c = (char)(i + 97) ;

            int first = s.indexOf(c);

            int last = s.lastIndexOf(c);

            if(first != -1 && last != -1){

                if(distance[i] != last - first - 1 ){

                    return false ;
                }
            }
        }
        return true ;
    }
}