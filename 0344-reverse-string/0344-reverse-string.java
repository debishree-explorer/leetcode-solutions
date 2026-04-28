class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        char c = '\0';

        while(left<right){
            c = s[right];
            s[right]= s[left];
            s[left] = c;

            left++;
            right--;
        }
    }
}