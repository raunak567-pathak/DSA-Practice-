class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length ;

        int [] ans = new int [n + 1 ];
        int [] res = new int [n] ;
        int count = 0 ;

        for(int i = 0 ; i < n ; i++){

            if(++ans[A[i]] % 2 == 0)count++;
            if(++ans[B[i]] % 2 == 0)count++;

            res[i] = count ;
        }
        return res ;
    }
}