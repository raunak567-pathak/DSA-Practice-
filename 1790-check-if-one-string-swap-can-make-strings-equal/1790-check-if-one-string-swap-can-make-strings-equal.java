class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))return true ;

    char [] f1 = new char [26];
    char [] f2  = new char [26];

    int diff = 0 ;

    for(int i = 0 ; i < s2.length() ; i++){
        char c1 = s1.charAt(i);
        char c2 = s2.charAt(i);

        if(c1 != c2){
            diff++;

            if(diff > 2)return false;
        }
        f1[c1 - 'a']++;
        f2[c2 - 'a']++;
    }
    return Arrays.equals(f1 , f2);
    }
}