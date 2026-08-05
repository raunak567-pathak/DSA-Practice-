class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();

        int limit = 1 << n ;

        for(int i = 0 ; i < limit ; i++){
            list.add(i ^ ( i >> 1));
        }
        return list;
    }
}