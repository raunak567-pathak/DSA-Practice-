class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder()) ;

        int n = Math.min(k , list.size()) ;
        
        int [] res = new int [n];

        for(int i = 0 ; i < n ; i++){

            res[i] = list.get(i);
        }
        return res ;
    }
}