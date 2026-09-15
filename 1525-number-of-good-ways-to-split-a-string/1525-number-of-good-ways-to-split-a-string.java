class Solution {
    public int numSplits(String s) {
        Map<Character,Integer> left = new HashMap<>();
        Map<Character,Integer> right = new HashMap<>();


        for(int i = 0 ; i < s.length() ; i++)

            right.put(s.charAt(i) , right.getOrDefault(s.charAt(i) , 0 ) + 1);

            int count = 0 ;


            for(int i = 0 ; i < s.length() ; i++){

                left.put(s.charAt(i) , left.getOrDefault(s.charAt(i) , 0) + 1);
                right.put(s.charAt(i) , right.getOrDefault(s.charAt(i) , 0) - 1);

                if(right.get(s.charAt(i)) == 0)

                    right.remove(s.charAt(i));

                    if(left.size() == right.size()){
                        count++;
                    }
                }
                return count ;
    }
}