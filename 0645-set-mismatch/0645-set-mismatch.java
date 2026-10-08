class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int [] arr = new int [nums.length + 1 ];

        int d = 0 , m = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            arr[nums[i]]++;
        }

        for(int i =  1 ; i <= nums.length ; i++){

            if(arr[i] == 2){
                d = i ;
            }else if(arr[i] == 0){
                m = i ;
            }
        }
        return new int [] {d , m } ;
    }
}