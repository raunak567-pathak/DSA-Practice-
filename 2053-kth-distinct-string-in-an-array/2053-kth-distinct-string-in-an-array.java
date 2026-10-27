class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>() ;

        for(String num : arr){

            map.put(num , map.getOrDefault(num , 0) + 1) ;
        }
        int count = 0 ;

        for(String num : arr){

            if(map.get(num) == 1){

                count++;
            }

            if(count == k){

                return num ;
            }
        }
        return "" ;
    }
}