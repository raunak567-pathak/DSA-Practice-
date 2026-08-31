class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int [] res = new int [101];

        for(int num : nums){
            if(res[num]++ >=  2){
                return false;
            }
        }
        return true;
    }
}