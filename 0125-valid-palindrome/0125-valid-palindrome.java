class Solution {
    public boolean isPalindrome(String s) {
        int left = 0,right = s.length()-1;
        char a,b;
        while(left<right){
            a = s.charAt(left);
            b = s.charAt(right);
            if(a>='A' && a<='Z') a = (char)(a+' ');
            if(b>='A' && b<='Z') b = (char)(b+' ');

            if (!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))){
                left++;
                continue;
            }

            if (!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
                right--;
                continue;
            }
            if(a!=b) return false;
            left++;
            right--;
            
        }
        return true;
    }
}