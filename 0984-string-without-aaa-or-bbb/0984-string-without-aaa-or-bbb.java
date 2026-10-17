class Solution {
    public String strWithout3a3b(int a, int b) {
        

        StringBuilder res = new StringBuilder() ;

        while(a > 0 || b > 0 ){

            if(a > b ){

                if(a  > 1){

                    res.append("aa");
                    a -= 2 ;
                }else {
                    res.append("a");
                    a--;
                }
                if(b  > 0){
                    res.append("b");
                    b--;
                }
            }else if( b > a){
                if(b > 1){
                    res.append("bb");
                    b -= 2;
                }else{
                    res.append("b");
                    b--;
                }
                if(a > 0){
                    res.append('a');
                    a--;
                }
            }else{
                res.append("ab");
                a--;b--;
            }
        }
        return res.toString();
    }
}