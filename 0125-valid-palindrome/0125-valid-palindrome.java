class Solution {
    public boolean isPalindrome(String str) {

        String s=str.toLowerCase();
        String alpha="";
        String rev="";

         for(int i=0;i<s.length();i++){
        if((s.charAt(i)>='a'&&s.charAt(i)<='z')||s.charAt(i)>='0'&&s.charAt(i)<='9'){

            alpha=alpha+s.charAt(i);
            rev=s.charAt(i)+rev;
        }
         }
         if(alpha.equals(rev)) return true;

         return false;

    }
}