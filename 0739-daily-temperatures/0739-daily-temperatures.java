class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();

        int n = temperatures.length ;

        int [] res = new int [n];

        for(int i = 0 ; i < n ; i++){

            int curr = temperatures[i];

            while(!stack.isEmpty() && temperatures[stack.peek()] < curr){
                int k = stack.pop();
                res[k] = i - k ;
            }
            stack.push(i);
        }
        return res;
    }
}