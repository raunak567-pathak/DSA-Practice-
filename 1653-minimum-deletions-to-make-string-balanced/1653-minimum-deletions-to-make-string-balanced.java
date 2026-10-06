class Solution {
    public int minimumDeletions(String s) {
        
        int count = 0 ;

        Deque<Character> q = new ArrayDeque<>() ;

        for(char c : s.toCharArray()){

            if(!q.isEmpty() && q.peek() == 'b' && c == 'a'){
                q.pop();
                count++;
            }else{
                q.push(c);
            }
        }
        return count  ;
    }
}