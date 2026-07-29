class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();

        int max = 0 ;

        for(List<Integer> w : wall){

            int sum = 0 ;

            for(int i = 0 ; i < w.size() - 1; i++){

                sum += w.get(i);

                map.put(sum , map.getOrDefault(sum , 0) + 1);

                max = Math.max(max , map.get(sum));
            }
        }
        return wall.size() - max;
    }
}