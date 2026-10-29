class Solution {
    public int maximumProduct(int[] nums, int k) {
        
        int mod = 1000000007 ;

        PriorityQueue<Integer> q = new PriorityQueue<>() ;

        for(int num : nums){

            q.offer(num);
        }

        for(int i = 0 ; i < k ; i++){

            int small = q.poll() ;

            q.offer(small + 1 );
        }

        long prod = 1 ;

        while(!q.isEmpty()){

            prod = (prod * (q.poll())) % mod ;
        }
        return (int)prod ;
    }
}