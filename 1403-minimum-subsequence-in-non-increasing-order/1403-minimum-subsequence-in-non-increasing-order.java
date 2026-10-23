class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        

        int total = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            total += nums[i];
        }

        Arrays.sort(nums) ;
        int sum = 0 ;

        List<Integer> list = new ArrayList<>() ;
        for(int i = nums.length - 1;i  >= 0 ; i--){
            list.add(nums[i]);
            sum += nums[i];

            if(sum > total - sum){
                return list ;
            }
        }
        return list ;
    }
}