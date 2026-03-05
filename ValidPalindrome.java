class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        String rev=new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}
// good approach for the small code and it also uses StringBuilder and lowercase and remove the extra letters nd then reverse the characters
