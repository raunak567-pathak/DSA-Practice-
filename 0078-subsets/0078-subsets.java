class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums) ;

        List<List<Integer>> list = new ArrayList<>() ;

        list.add(new ArrayList<>()) ;

        for(int i = 0 ; i < nums.length ; i++){

            int n = list.size() ;

            for(int j = 0 ; j < n ; j++){

                List<Integer> set  = new ArrayList<>(list.get(j));

                set.add(nums[i]) ;

                list.add(set) ;
            }
        }
        return list ;
    }
}