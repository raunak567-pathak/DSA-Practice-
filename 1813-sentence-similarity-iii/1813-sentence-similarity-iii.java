class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
     Deque<String> d1 = new ArrayDeque<>()   ;
     Deque<String> d2 = new ArrayDeque<>();

     for(String w : sentence1.split(" ")){
        d1.add(w);
     
     }

     for(String w : sentence2.split(" ")){
        d2.add(w);

     }

     while(!d1.isEmpty() && !d2.isEmpty() && d1.peekFirst().equals(d2.peekFirst())){
        d1.pollFirst();
        d2.pollFirst();
     }

     while(!d1.isEmpty() && !d2.isEmpty() && d1.peekLast().equals(d2.peekLast())){
        d1.pollLast();
        d2.pollLast();
     }
     return d1.isEmpty() || d2.isEmpty();
    }
}