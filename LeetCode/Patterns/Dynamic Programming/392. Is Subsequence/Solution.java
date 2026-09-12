class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        int i=0,j=0;
        while(i<len1 && j<len2){
            char ch1=s.charAt(i);
            char ch2=t.charAt(j);
            if(ch1==ch2){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==len1){
            return true;
        }
        else{
            return false;
        }
    }
}