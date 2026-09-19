class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        int j=0;
        int len=target.length;
        for(int i=1;i<=n && j<len;i++){
            if(i==target[j]){
                res.add("Push");
                j++;
            }
            else{
                res.add("Push");
                res.add("Pop");
            }
        }
        return res;
    }
}