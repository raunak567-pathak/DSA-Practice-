class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        int m = fruits.length ;
        int n = baskets.length ;
        int count = 0 ;

        for(int i = 0 ; i < m ;i++){
            for(int j = 0 ; j < n ; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = 0 ;
                    count++;
                    break;
                }
            }
        }
        return n - count ;
    }
}