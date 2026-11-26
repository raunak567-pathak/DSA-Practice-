class Solution {
    public String largestNumber(int[] nums) {
        
        int n = nums.length ;

        List<String> list = new ArrayList<>() ;

        for(int num : nums){

            list.add(String.valueOf(num)) ;
        }

        Collections.sort(list , (a , b) -> (b + a).compareTo(a + b )) ;

        StringBuilder res = new StringBuilder() ;

        for(String s : list){

            res.append(s) ;
        }

        if(res.charAt(0) == '0'){

            return "0" ;
        }

        return res.toString() ;
    }
}