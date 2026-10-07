class Solution {
    public int numIdenticalPairs(int[] nums) {
        int [] arr = new int [101] ;

        for(int num : nums){
            arr[num]++;
        }
        int count = 0 ;

        for(int num : arr){
            if(num > 0){
                count += (num * ( num - 1 ) / 2 );
            }
        }
        return count ;
    }
}