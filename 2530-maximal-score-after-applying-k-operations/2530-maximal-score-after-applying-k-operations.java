class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a , b) -> b - a);

        for(int num : nums){

            q.add(num);
        }

        long total = 0 ;
        for(int i = 0 ; i < k ; i++){

            int max = q.poll();

            total += max ;

            q.add((max + 2) / 3);
        }
        return total ;
    }
}