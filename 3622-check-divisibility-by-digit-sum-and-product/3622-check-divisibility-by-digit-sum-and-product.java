class Solution {
    public boolean checkDivisibility(int n) {
      int k =  n ;
      int sum = 0 ;
      int prod = 1 ;

      while(n > 0)  {

        int digit = n % 10 ;

        sum += digit ;

        prod *= digit ; 

         n /= 10 ;
      }

      int total = sum + prod ;

      if(k % total == 0)
      return true ;
      return false;
    }
}