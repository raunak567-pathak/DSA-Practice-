class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length ;
        int n = nums2.length ;

        if(m > n){

            return findMedianSortedArrays(nums2 , nums1);
        }

        int left = 0 ;

        int right = m ;

        while(left <= right) {

            int c1 = (left + right ) / 2 ;

            int c2 = (m + n + 1 ) / 2 - c1  ;

            int l1 = (c1 == 0 ) ? Integer.MIN_VALUE : nums1[c1 - 1 ];
            int l2 = (c2 == 0) ? Integer.MIN_VALUE :  nums2[c2 -  1] ;

            int r1 = (c1 == m) ? Integer.MAX_VALUE : nums1[c1];
            int r2 = (c2 == n) ? Integer.MAX_VALUE : nums2[c2];

            if(l1 <= r2 && l2 <= r1){

                if((m + n) % 2 == 0){

                    return (Math.max(l1 , l2 ) +  Math.min(r1 , r2 ) ) / 2.0;
                }else{

                    return Math.max(l1 , l2 );
                }
            }
            if(l1 > l2){
                 
                 right = c1 - 1 ;
            }else{

                left = c1 + 1 ;
            }
        }
        return 0.0;
    }
}