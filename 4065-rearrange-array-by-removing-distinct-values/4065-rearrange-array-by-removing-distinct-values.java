class Solution {
    public int[] rearrangeArray(int[] nums) {

        int max = 0 ;

        for(int num : nums){
            if(num > max){
                max = num ;
            }
        }
        
        int [] freq = new int [max + 1];

        for(int num : nums){

            freq[num]++;
        }

        int n = nums.length ;

        int [] res = new int [n];

        int idx = 0 ;

        while(idx < n){

            for(int i = 1 ; i <= max ; i++){

                if(freq[i] > 0){
                    res[idx++] = i ;

                    freq[i]--;
                }
            }
        }
        return res ; 
    }
}