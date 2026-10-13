class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int count = 0 ;
        int val = 0 ;

        for(int num : students){

            if(num == 0){
                count++;
            }else{
                val++;
            }
        }


        for(int nums : sandwiches){

            if(nums == 0){
                if(count == 0)return val ;
                count--;
            }else{
                if(val == 0)return count ;
                val-- ;
            }
        }
        return 0 ;
    }
}