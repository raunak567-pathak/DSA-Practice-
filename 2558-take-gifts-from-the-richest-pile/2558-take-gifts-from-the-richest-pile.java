class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()) ;

        for(int num : gifts)q.offer(num );
        for(int i = 0 ; i < k ; i++){
            int n = q.poll();
            q.offer((int)Math.floor(Math.sqrt(n))) ;
        }

        long sum = 0 ;

        while(!q.isEmpty()){

            sum += q.poll();
        }
        return sum ;
    }
}