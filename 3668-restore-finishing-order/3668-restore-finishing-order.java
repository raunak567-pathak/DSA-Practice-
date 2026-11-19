class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        

        Set<Integer> set = new HashSet<>() ;

        for(int num : friends){

            set.add(num) ;
        }

        List<Integer> list = new ArrayList<>() ;

        for(int id  : order){

            if(set.contains(id)){

                list.add(id) ;
            }
        }

        int [] res = new int [list.size()] ;

        for(int i = 0 ; i < list.size() ; i++){

            res[i] = list.get(i);
        }

        return res ;
    }
}