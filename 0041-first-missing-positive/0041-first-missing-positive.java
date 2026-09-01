class Solution {
    public int firstMissingPositive(int[] nums) {
     Set<Integer> set = new HashSet<>()   ;
     for(int num : nums){
        set.add(num);
     }

     int target = 1 ;
     while(set.contains(target)){
        target++;
     }
     return target ;
    }
}