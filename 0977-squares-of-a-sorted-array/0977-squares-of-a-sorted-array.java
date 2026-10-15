class Solution {
    public int[] sortedSquares(int[] nums) {

       int n = nums .length ;

       int left = 0 ;
       int right = n -  1 ;

       int []  res = new int [n];

       while(left <= right ){

        if(Math.abs(nums[left]) > Math.abs(nums[right])){

            res[n - 1] = nums[left] * nums[left] ;

            left++;
        }else{

            res[n - 1] = nums[right] * nums[right ];
            right--;
        }
        n--;
       }
       return res;
    }
}