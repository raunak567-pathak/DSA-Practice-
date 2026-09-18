class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i = 0 ;
        int max = 0 ;


        for(int num : houses){

            while(i < heaters.length - 1 && Math.abs(heaters[i + 1] - num) <= Math.abs(heaters[i] - num)){
                i++;
            }
            max = Math.max(max , Math.abs(heaters[i] - num));
        }
        return max;
    }
}