class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        
        List<Boolean> list = new ArrayList<>() ;
        for(String q : queries){
            list.add(match( q , pattern));
        }
        return list ;
    }

    boolean match(String q , String pattern){

        int i =  0 ;

        for(char c : q.toCharArray()){

            if(i < pattern.length() && c == pattern.charAt(i)){
                i++;
            }else if(Character.isUpperCase(c)){
                return false;
            }
        }
        return i == pattern.length() ;
    }
}