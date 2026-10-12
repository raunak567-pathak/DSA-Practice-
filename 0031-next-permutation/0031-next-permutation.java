class Solution {
    public void nextPermutation(int[] nums) {

       if(nums == null || nums.length <= 1) {
        return;
       }

       int n = nums.length ; 
        int i = n - 2 ;

        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        if(i >= 0 ){
            int j = n - 1 ;
            while(j >= 0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums , i , j );
        }
        rev(nums , i + 1 );
    }
    void swap(int [] nums , int a , int b){
        int temp = nums[a];
        nums[a] = nums[b] ;
        nums[b] = temp ;
    }

    void rev(int [] nums , int i ){

        int left  = i ;
        int right = nums.length - 1 ;
        while(left < right){
            swap(nums , left++ , right-- ) ;
        }
    }
}