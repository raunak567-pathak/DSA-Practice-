class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(new ArrayList<>() , list , candidates , target , 0);
        return list;
    }
    void helper(List<Integer> res , List<List<Integer>> list , int [] candidates , int curr , int start){
        if(curr < 0)return;
        else if(curr == 0)list.add(new ArrayList<>(res));
        else{
            for(int i = start ; i < candidates.length ; i++){
                res.add(candidates[i]);
                helper(res , list , candidates , curr - candidates[i] , i);
                res.remove(res.size() - 1);
            }
        }
    }
}