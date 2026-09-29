class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        
        int n = aliceValues.length ;

        int [][] stones = new int [n][3];


        for(int i = 0 ; i < n ; i++){

            stones[i][0] = aliceValues[i] + bobValues[i];
            stones[i][1] = aliceValues[i];
            stones[i][2]= bobValues[i];
        }

        Arrays.sort(stones , (a , b) -> b[0] - a[0]);

        int c1 = 0 ;
        int c2 = 0 ;

        for(int i = 0 ; i < n ;i++){

            if(i % 2 == 0){

                c1 += stones[i][1];
            }else{
                c2 += stones[i][2];
            }
        }
        if(c1 > c2)return 1 ;
        if(c2 > c1)return -1;
        return 0 ;
    }
}