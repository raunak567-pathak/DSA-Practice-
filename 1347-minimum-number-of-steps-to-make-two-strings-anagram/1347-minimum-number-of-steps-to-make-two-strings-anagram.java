class Solution {
    public int minSteps(String s, String t) {
        if(s.equals(t)){
            return 0 ;
        }
        int  n = s.length();

        int count = 0 ;

        int [] arr = new int [26];

        for(int i = 0 ; i < n ; i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
            
        }

        for(int num : arr){
            if(num > 0){

                count += num ;
            }
        }
        return count;
    }
}