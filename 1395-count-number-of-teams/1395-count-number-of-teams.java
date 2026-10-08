class Solution {
    public int numTeams(int[] rating) {
        
        int n = rating.length ; 

        int count = 0 ;

        int [] arr1 = new int [n];
        int [] arr2 = new int [n];

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ;j++)
                if(rating[i] < rating[j]){
                    arr1[i]++;
                }else{
                    arr2[i]++;
                }
            }

            for(int i = 0 ; i < n ; i++){
                for(int j = i + 1 ; j < n ; j++){
                    if(rating[i] < rating[j]){
                        count += arr1[j];
                    }else{
                        count += arr2[j];
                    }
                }
            }
        return count ; 
    }
}