class Solution {
    public boolean isPalindrome(String str) {

        String s=str.toLowerCase();
        String alpha="";
        String rev="";

         for(int i=0;i<s.length();i++){
        if( (int)s.charAt(i)>=0 && (int)s.charAt(i)<=47 || (int)s.charAt(i)>=58 && (int)s.charAt(i)<=64 || (int)s.charAt(i)>=91 && (int)s.charAt(i)<=96 || (int)s.charAt(i)>=123 && (int)s.charAt(i)<=127) continue;
        else{
            rev=s.charAt(i)+rev;
            alpha=alpha+s.charAt(i);
        }
         }
         if(alpha.equals(rev)) return true;

         return false;

    }
}