class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0 ;
        int n = colors.length ;

        for(int i = 0 ; i < n ; i++){

            int prev = colors[i];

            int curr = colors[(i + 1 ) % n ];

            int next = colors[(i + 2) % n ];

            if(prev != curr && curr != next)count++;
        }
        return count ;
    }
}