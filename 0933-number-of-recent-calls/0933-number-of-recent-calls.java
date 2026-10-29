class RecentCounter {
Queue<Integer> q ;
    public RecentCounter() {
         q = new LinkedList<>();
    }
    
    public int ping(int t) {
        
        q.add(t);
        int sum = t - q.peek();

        while(sum > 3000 && q.size() > 0){
            q.poll() ;
            sum = t - q.peek() ;
        }
        return q.size() ;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */