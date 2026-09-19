class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long [] arr = new long[n];

        for(int [] r : roads){

            arr[r[0]]++;
            arr[r[1]]++;
        }

        Arrays.sort(arr);

        long count = 0 ;
        long prod = 1 ;

        for(long num : arr){

            count += (num * prod);
            prod++;
        }
        return count ;
    }
}