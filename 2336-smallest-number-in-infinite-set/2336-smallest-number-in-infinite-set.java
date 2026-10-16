class SmallestInfiniteSet {
PriorityQueue<Integer> q ;
Set<Integer> set ;
int curr ;
    public SmallestInfiniteSet() {
        q = new PriorityQueue<>() ;
        set = new HashSet<>() ;
        curr = 1 ;
    }
    
    public int popSmallest() {
        
        while(!q.isEmpty()){

            int val = q.poll() ;
            set.remove(val);
            return val ;
        }
        return curr++;
    }
    
    public void addBack(int num) {
        
        if(num < curr && !set.contains(num)){
            q.add(num);
            set.add(num) ;
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */