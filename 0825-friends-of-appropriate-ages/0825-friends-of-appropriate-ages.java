class Solution {
    public int numFriendRequests(int[] ages) {
        
        int [] ans = new int [121] ;
        int count = 0 ;

        for(int age : ages ){

            ans[age]++;
        }

        for(int i = 0 ; i <= 120 ; i++){
            for(int j = (int)(0.5 * i ) + 7 +  1 ; j <= i ; j++){

                count += ans[i] * ans[j] ;


                if(i == j ){

                    count -= ans[i];
                }
            }
        }
        return count ;
    }
}