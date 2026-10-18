class Solution {
    public boolean isValidSerialization(String preorder) {
        
        String [] node = preorder.split(",");
        int diff = 1 ;

        for(String n : node){
            if(--diff < 0)return false;
            if(!n.equals("#"))diff += 2 ;
        }
        return diff == 0 ;
    }
}