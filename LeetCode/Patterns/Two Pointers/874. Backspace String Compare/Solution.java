class Solution {
    public boolean backspaceCompare(String s, String t) {
        int s_len=s.length();
        int t_len=t.length();
        StringBuffer sb_s=new StringBuffer();
        StringBuffer sb_t=new StringBuffer();
        for(int i=0;i<s_len;i++){
            char ch=s.charAt(i);
            if(ch!='#'){
                sb_s.append(ch);
            }
            else if(ch=='#'){
                if(sb_s.length()>0){
                    sb_s.deleteCharAt(sb_s.length()-1);
                }
            }
        }
        s=sb_s.toString();
        System.out.println(s);
        for(int i=0;i<t_len;i++){
            char ch=t.charAt(i);
            
            if(ch!='#'){
                sb_t.append(ch);
            }
            else if(ch=='#'){
                if(sb_t.length()>0){
                    sb_t.deleteCharAt(sb_t.length()-1);
                }
            }
        }
        t=sb_t.toString();
        System.out.println(t);
        if(s.equals(t)){
            return true;
        }
        return false;
    }
}