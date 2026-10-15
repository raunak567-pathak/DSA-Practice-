class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> list = new ArrayList<>() ;
        Set<Integer> set = new HashSet<>() ;

        int min = Integer.MAX_VALUE  ;
        int max = Integer.MIN_VALUE  ;

        for(int num : nums ){

            set.add(num) ;
            
            min = Math.min(num , min );
            max = Math.max(num , max) ;
        }

        for(int i = min ; i <= max ; i++){

            if(!set.contains(i)){
                list.add(i) ;
            }
        }
        return list ;
    }
}