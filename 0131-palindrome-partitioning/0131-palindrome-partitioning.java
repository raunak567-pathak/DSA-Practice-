class Solution {
    List<List<String>> list = new ArrayList<>() ;
    public List<List<String>> partition(String s) {
        helper(s , new ArrayList<>());
        return list ;
    }

    void helper(String s , List<String> res){
        if(s.length() == 0 || s == null){
            list.add(new ArrayList<>(res));
            return ;
        }
        for(int i = 1 ; i <= s.length() ; i++){

            String pal = s.substring(0 , i) ;

            if(!isPal(pal))continue ;

            res.add(pal);

            helper(s.substring(i , s.length()) , res) ;
            res.remove(res.size() - 1 );
        }
        return ;
    }

    boolean isPal(String s){

        int i = 0 ;
        int j = s.length() - 1 ;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j))return false ;
            i++;
            j--;
        }
        return true ;
    }
}