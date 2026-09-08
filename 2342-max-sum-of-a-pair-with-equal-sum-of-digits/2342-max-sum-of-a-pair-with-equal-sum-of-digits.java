class Solution {
    public int maximumSum(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>() ;
       int max = -1;

       for(int num : nums){
        int digit = helper(num);

        if(map.containsKey(digit)){
            max = Math.max(max , map.get(digit) + num);

            if(num > map.get(digit)){
                map.put(digit , num);
            }
        }else{
            map.put(digit , num);
        }
       }
       return max;
    }
    int helper(int n){
        int sum = 0 ;
        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}