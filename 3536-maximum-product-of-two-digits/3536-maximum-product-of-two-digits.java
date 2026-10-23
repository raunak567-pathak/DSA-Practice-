class Solution {
    public int maxProduct(int n) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()) ;

        while(n > 0){

            q.add(n % 10) ;

            n = n / 10 ;
        }

        int first = q.poll() ;
        int sec = q.poll() ;

        return first * sec ;
    }
}