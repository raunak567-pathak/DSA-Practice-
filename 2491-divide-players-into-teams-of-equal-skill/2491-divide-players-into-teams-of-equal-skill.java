class Solution {
    public long dividePlayers(int[] skill) {
        

        Arrays.sort(skill) ;

        int i = 0 ;
        int j = skill.length - 1;

        long ans = 0 ;

        long set = skill[i] + skill[j] ;

        while(i < j ){

            long diff = skill[i] + skill[j];
            ans += skill[i] * skill[j] ;
            i++;
            j--;

            if(set != diff)return -1 ;
        }
        return ans ;
    }
}