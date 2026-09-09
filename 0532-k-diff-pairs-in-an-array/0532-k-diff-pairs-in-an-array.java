class Solution {
    public int findPairs(int[] nums, int k) {
     if(k < 0)   {
        return 0 ;
     }

     Set<Integer> seen = new HashSet<>();
     Set<Integer> unseen = new HashSet<>() ;

     for(int num : nums){

        if(seen.contains(num - k)){

            unseen.add(num - k);
        
        }

        if(seen.contains(num + k)){
            unseen.add(num);
        }
        seen.add(num);
     }
     return unseen.size();
    }
}