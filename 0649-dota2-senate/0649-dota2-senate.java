class Solution {
    public String predictPartyVictory(String senate) {
        
        int n = senate.length() ;

        Queue<Integer> q1 = new LinkedList<>() ;
        Queue<Integer> q2 = new LinkedList<>() ;



        for(int i = 0 ; i < n ; i++){

            if(senate.charAt(i) == 'R'){
                q1.offer(i);
            }else{
                q2.offer(i);
            }
        }
        while(!q1.isEmpty() && !q2.isEmpty()){

            int r1 = q1.poll() ;
            int d1 = q2.poll() ;

            if(r1 < d1){
                q1.offer(r1 + n);
            }else{
                q2.offer(d1 + n);
            }
        }
        if(q1.isEmpty()){
            return "Dire";
        }else{
            return "Radiant" ;
        }
    }
}