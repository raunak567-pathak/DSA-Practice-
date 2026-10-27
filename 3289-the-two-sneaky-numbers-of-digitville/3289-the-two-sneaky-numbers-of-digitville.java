class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int [] res = new int [2] ;

        int j = 0 ;

        Set<Integer> set = new HashSet<>() ;

        for(int num : nums){

            if(set.contains(num)){

                res[j++] = num ;
            }else{
                set.add(num);
            }
        }
        return res ;
    }
}