class Solution {
    public boolean isPalindrome(int x) {
    //    String  s = Integer.toString(x);
    //    int n = s.length();
    //    for(int i=0;i<n/2;i++){
    //     if(s.charAt(i) != s.charAt(n-i-1)){
    //         return false;
    //     }
    //    } 
    //    return true;
    int temp = x;
    int sum = 0;
    while(temp > 0){
        int rem = temp%10;
        sum = sum*10 + rem;
        temp = temp/10;
    }
    if(sum == x)
    return true;
    else
    return false;
    }
}