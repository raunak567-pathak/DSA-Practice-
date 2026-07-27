class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length ; 
        
        int first = nums[n-1];
        int sec = nums[n-2];

    
        int ans = (first - 1) * (sec - 1);
        return ans;
    }
}