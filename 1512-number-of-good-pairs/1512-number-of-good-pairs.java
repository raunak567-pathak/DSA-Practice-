class Solution {
    public int numIdenticalPairs(int[] nums) {
        int [] res = new int [101];
        for(int num : nums){
            res[num]++;
        }
        int ans = 0 ;
        for(int num : res){
            if(num > 1){
                ans += (num * (num -1 )) / 2 ;
            }
        }
        return ans;
    }
}