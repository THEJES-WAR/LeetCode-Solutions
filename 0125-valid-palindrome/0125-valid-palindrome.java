class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\p{Punct}", "");
        s = s.replaceAll("\\s+", "");
        String r = new StringBuilder(s).reverse().toString();
        System.out.print(s+" "+r);
        return s.equals(r);
    }
}