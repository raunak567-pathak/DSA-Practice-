class Solution {
    public int maxProduct(int[] nums) {
        

        Arrays.sort(nums) ;


        int n = nums.length ;

        int f = nums[n - 1 ];
        int s = nums[n - 2];

        return (f - 1) * ( s - 1 );
    }
}