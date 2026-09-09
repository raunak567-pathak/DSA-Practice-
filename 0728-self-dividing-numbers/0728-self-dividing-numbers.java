class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left ; i <= right ; i++){
            if(Issub(i)){
                list.add(i);
            }
        }
        return list ;
    }

    boolean Issub(int num){

        int n = num ; 
        while(n > 0){

            int rem = n % 10;

            if(rem == 0 || (num % rem ) != 0){
                return false;
            }
            n = n / 10 ;
        }
        return true ;
    }
}