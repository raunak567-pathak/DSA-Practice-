class Solution {
    public int numberOfBeams(String[] bank) {
        
        int count = 0 ;
        int total = 0  ;


        for(String num : bank){

            int net = 0 ;

            for(char c : num.toCharArray()){

                if(c == '1')net++;
            }

            if(net > 0){

                count += (total * net) ;
                total = net ;
            }
        }
        return count ;
    }
}