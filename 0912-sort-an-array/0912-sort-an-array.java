class Solution {
    public int[] sortArray(int[] nums) {
        helper(nums , 0 , nums.length - 1);
        return nums ;
    }

    void helper(int [] nums , int low , int high){

        if(low >= high)return  ;

        int mid = low + (high - low) / 2 ;

        helper(nums , low , mid );
        helper(nums , mid + 1 , high);

        merge(nums , low , mid , high);
    }

    void merge(int [] nums , int low , int mid , int high){

        int [] res = new int[high - low  + 1];

        int left = low ;
        int right = mid + 1 ;
        int k = 0 ;

        while(left <= mid && right <= high){
            if(nums[left] < nums[right]){
                res[k++] = nums[left];
                left++;
            }else{
                res[k++] = nums[right];
                right++;
            }
        }
            while(left <= mid){
                res[k++] = nums[left];
                left++;
            }
            while(right <= high){
                res[k++] = nums[right];
                right++;
            }
            for(int i = 0 ; i < res.length ; i++){
                nums[low + i] = res[i];
            }
    }
}