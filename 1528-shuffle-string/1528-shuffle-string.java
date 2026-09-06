class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();

        StringBuilder res = new StringBuilder();

        char [] arr = new char [n];

        for(int i = 0 ; i < n ; i++)arr[indices[i]++] = s.charAt(i);
        res.append(arr);

        return res.toString() ;
    }
}