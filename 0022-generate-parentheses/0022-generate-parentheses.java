class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(0 , 0 , n , "" , list);
        return list ;
    }
    void helper(int ob , int cb , int n , String curr , List<String> list){
        if(curr.length() == 2*n){
            list.add(curr);
            return ;
        }
        if(ob < n){
            helper(ob + 1 , cb , n , curr + "(" , list);
        }
        if(cb < ob){
            helper(ob , cb + 1 , n , curr + ")" ,list);
        }
    }
}