class Solution {
    public int bestClosingTime(String customers) {
        
        int count = 0 ;

        for(char c : customers.toCharArray()) {

            if(c ==  'Y')count++;
        }

        int curr = 0 ;
        int min = count ;

        for(int i = 0 ; i < customers.length() ; i++){

            if(customers.charAt(i) == 'Y'){
                count--;
            }else{
                count++;
            }

            if(count < min){

                min = count ;

                curr = i + 1 ;
            }
        }
        return curr ;
    }
}