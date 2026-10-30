class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        

        int count = 0 ;

        Map<Integer,Integer> map = new HashMap<>() ;

        for(int i = 0 ; i < time.length ; i++){

            int rem = time[i] % 60 ;

            int target = (600 - rem )  % 60 ;

            if(map.containsKey(target)){

                count += map.get(target) ;
            }

            map.put(rem , map.getOrDefault(rem , 0) + 1 );
        }
        return count ;
    }
}