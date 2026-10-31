class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int [] num : edges){

            int u = num[0];
            int v = num[1];

            map.computeIfAbsent(u , k -> new ArrayList<>()).add(v);
             map.computeIfAbsent(v , k -> new ArrayList<>()).add(u);
        }

        Set<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        q.offer(source);
        set.add(source);

        while(!q.isEmpty()){

            int node = q.poll();

            if(node == destination){
                return true;
            }
            List<Integer> list = map.getOrDefault(node , new ArrayList<>()) ;

            for(int res : list){

                if(!set.contains(res)){

                    set.add(res) ;
                    q.offer(res) ;
                }
            }
        }
        return false ;
    }
}