class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> set = new HashSet<>() ;

        for(String mail : emails ){

            set.add(helper(mail));
        }

        return set.size();
    }

    String helper(String mail){

        StringBuilder res = new StringBuilder() ;

        for(int i = 0 ; i < mail.length() ; i++){

            if(mail.charAt(i) == '@' || mail.charAt(i) == '+' )break ;

            if(mail.charAt(i) == '.')continue ;

            res.append(mail.charAt(i));
        }

        res.append(mail.substring(mail.indexOf('@') , mail.length()));

        return res.toString() ;
    }
}