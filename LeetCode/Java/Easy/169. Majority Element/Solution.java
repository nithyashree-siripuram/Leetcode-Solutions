class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int max=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            c=0;
            for(int j=0;j<len;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>max){
                max=c;
            }
        }
        return max;
    }
}