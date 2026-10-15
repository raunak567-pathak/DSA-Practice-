class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>() ;

        int [] arr = new int [nums.length + 1 ] ;

        for(int num : nums ){

            if(arr[num] >= list.size()) {

                list.add(new ArrayList<>()) ;
            }

            list.get(arr[num]).add(num) ;

            arr[num]++;
        }
        return list ;
    }
}