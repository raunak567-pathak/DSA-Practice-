class Solution {
    public void wiggleSort(int[] nums) {
        
        int n = nums.length ;

        int [] res = nums.clone() ;

        Arrays.sort(res) ;

        int j = n - 1 ;

        for(int i =  1 ; i < n ; i+= 2){

            nums[i] = res[j--];
        }
        for(int i = 0 ; i < n ; i+=2 ){

            nums[i] = res[j--] ;
        }
    }
}