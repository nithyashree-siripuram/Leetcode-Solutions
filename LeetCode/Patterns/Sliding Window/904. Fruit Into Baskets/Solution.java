class Solution {
    public int totalFruit(int[] fruits) {
        int len=fruits.length;
        int freq[]=new int[10];
        int s=0;
        int ind=0;
        for(int i=0;i<len;i++){
            freq[fruits[i]]++;
        }
        for(int i=freq.length-1;i>=0;i--){
            ind=0;
            if(i!=0){
                s=s+freq[i];
                ind++;
            }
            if(ind==2){
                break;
            }
        }
        return s;
    }
}