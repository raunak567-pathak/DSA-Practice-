class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = nums.length - 1 ;
        int j = 0 ;

        while(j <= i){

            if(nums[i] == val){
                i--;
            }else{
                if(nums[j] == val){
                    int temp = nums[i] ;
                    nums[i] = nums[j] ;
                    nums[j] = temp ;
                    j++;
                    i--;
                }
                else{
                    j++;
                }
            }
        }
        return i + 1 ;
    }
}