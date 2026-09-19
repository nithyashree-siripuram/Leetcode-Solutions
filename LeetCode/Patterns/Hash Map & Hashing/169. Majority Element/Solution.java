class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int max=0;
        for(int i=0;i<len;i++){
            int c=0;
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>=(len/2)) return nums[i];
        }
        return 0;

    }
}