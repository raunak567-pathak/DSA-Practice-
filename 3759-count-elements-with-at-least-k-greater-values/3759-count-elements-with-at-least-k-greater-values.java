class Solution {
    public int countElements(int[] nums, int k) {
        if(k == 0)return nums.length ;

        PriorityQueue<Integer> q = new PriorityQueue<>() ;

        for(int num : nums){
            q.add(num);
            if(q.size() > k){
                q.poll();
            }
        }
        int thresh = q.peek();
        int count  = 0 ;

        for(int num : nums){
            if(num < thresh){
                count++;
            }
        }
        return count ;
    }
}