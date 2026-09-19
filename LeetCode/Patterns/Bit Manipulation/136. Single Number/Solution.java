class Solution{
    public int singleNumber(int[] nums){
        int len=nums.length;
        int freq[]=new int[9999999];
        for(int i=0;i<len;i++){
            freq[nums[i]]++;          
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                return i;
            }
        }
        return -1;
    }
}