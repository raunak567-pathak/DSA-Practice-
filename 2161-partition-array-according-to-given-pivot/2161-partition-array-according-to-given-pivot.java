class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length ;
        int index = 0 ;

        int [] res = new int [n];

        for(int i = 0 ; i < n ; i++){
            if(nums[i] < pivot){

                res[index++] = nums[i];
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == pivot){
                res[index++] = nums[i];
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > pivot){
                res[index++] = nums[i];
            }
        }
        return res;
    }
}