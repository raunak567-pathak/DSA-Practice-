class Solution {
    public boolean lemonadeChange(int[] bills) {

       int m = bills.length ;

       if(m == 0) 
       return false ;

       int five = 0 , tens = 0 ;

       for(int i = 0 ; i < m ; i++){
        if(bills[i] == 5){
            five++;
        }else if(bills[i] == 10){
                if(five > 0){
                    tens++;
                    five--;
                }else
                    return false ;
                }else{
                    if(five > 0 && tens > 0){
                        tens--;
                        five--;
                    }else if(five >= 3)
                        five -= 3 ;
                        else
                        return false; 
                    }
                }
        return true ;
    }
}