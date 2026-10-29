class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int n = nums.length ;

        int ans = 0 ;

        for(int num : nums) {

            int sum = 0 ;

            int count = 0 ;

            for(int i = 1 ; i <= Math.sqrt(num); i++){

                if(num % i == 0){
                sum += i ;
                count++;

                if(i != num / i ){

                    count++;
                    sum += num / i ;
                }
            }
        }
        if(count == 4){
            ans += sum ;
        }
        }
        return ans ;
    }
}