class Solution {
    public int[] diStringMatch(String s) {
        int len=s.length();
        int arr[]=new int[len+1];
        int k=0,j=len;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='I'){
                arr[i]=k;
                k++;
            }
            else if(s.charAt(i)=='D'){
                arr[i]=j;
                j--;
            }
        }
        arr[len]=k;
        return arr;
    }
}