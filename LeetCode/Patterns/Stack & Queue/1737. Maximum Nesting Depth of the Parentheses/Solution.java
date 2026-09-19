class Solution {
    public int maxDepth(String s) {
        int len=s.length();
        int c=0;
        int res=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='('){
                c++;
                res=Math.max(res,c);
            }
            else if(s.charAt(i)==')'){
                c--;
            }
        }
        return res;
    }
}