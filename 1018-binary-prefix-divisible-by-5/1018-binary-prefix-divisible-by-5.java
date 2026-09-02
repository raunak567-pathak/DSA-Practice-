class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();

        int count = 0 ;

        for(int num : nums){
            count = (2 * count + num )  %  5 ;

            list.add(count == 0);
        }
        return list ;
    }
}