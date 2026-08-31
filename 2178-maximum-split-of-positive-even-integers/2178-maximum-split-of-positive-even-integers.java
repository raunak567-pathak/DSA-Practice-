class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        LinkedList<Long> list = new LinkedList<>();

        if(finalSum % 2 == 0){

            long i = 2 ;

            while(i <= finalSum){

                list.offer(i);
                finalSum -= i;
                i += 2 ;
            }
            list.offer(finalSum + list.pollLast());
        }
        return list ;
    }
}