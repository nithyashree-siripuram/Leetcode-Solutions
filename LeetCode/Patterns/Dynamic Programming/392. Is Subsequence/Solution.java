class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_len=s.length();
        int t_len=t.length();
        int i=0;
        int j=0;
        while(i<s_len && j<t_len){
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
        if(i==s_len) return true;
        else return false;
    }
}