
class Solution {
    int max = 0;
    public int maxProduct(String s) {
        char [] arr = s.toCharArray();
        helper(arr , 0 , "" , "");
        return max;
    }
  void  helper(char [] arr , int i , String s , String p){
        if(i >= arr.length){
            if(isValid(s) && isValid(p)){
                max = Math.max(max , s.length() * p.length());
            }
            return ;
        }
            helper(arr , i + 1 , s + arr[i] , p);
            helper(arr , i + 1 , s , arr[i] + p);
            helper(arr , i + 1 , s , p);
        }
    boolean isValid(String arr){
        int i = 0 , j = arr.length() - 1;
        while(i <= j){
            if(arr.charAt(i) != arr.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}