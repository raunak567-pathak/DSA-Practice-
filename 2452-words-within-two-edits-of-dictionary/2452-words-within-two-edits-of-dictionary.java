class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        List<String> list = new ArrayList<>() ;

        for(String q  : queries){

            for(String d : dictionary){
                

                if(helper(q , d)){

                    list.add(q) ;

                    break ;
                }
            }
        }
        return list ;
    }

    private boolean helper(String  s , String t){

        int count = 0 ;

        for(int i = 0 ; i < s.length()  ;  i++){

            if(s.charAt(i) != t.charAt(i)){

                count++;

                if(count > 2){

                    return false;
                }
            }
        }
        return true ;
    }
}