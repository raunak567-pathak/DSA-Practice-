class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int max = 0;

        for(int num : nums){

            if(num > max){

                max = num ;
            }
        }

        int [] freq = new int [max  + 1];

        for(int num : nums){

            freq[num]++;
        }

        int n = nums.length ;
        int idx = 0 ;

        int [] ans = new int[n] ;

        while(idx < n){

            for(int i = 1 ; i <= max ; i++){

                if(freq[i] > 0){

                    ans[idx++] = i ;

                    freq[i]--;
                }
            }
        }
        return ans ;
    }
}