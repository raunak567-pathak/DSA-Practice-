class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length ;

        double [] res = new double[n];

        for(int i = 0 ; i < n ; i++){

            res[i] = (double)dist[i] / speed[i];
        }

        Arrays.sort(res);
        int count = 0 ;

        for(int i = 0 ; i < n ; i++){

            if(res[i] <= i){
                break ;
            }else{
                count++;
            }
        }
        return count; 
    }
}