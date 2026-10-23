class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        
        if(nums.length % k != 0)return false ;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int num : nums){
            q.offer(num) ;
        }

        while(!q.isEmpty()){

            int curr = q.poll() ;

            for(int i = 1 ; i < k ; i++){

                if(!q.remove(curr + i))return false;
            }
        }
        return true ;
    }
}