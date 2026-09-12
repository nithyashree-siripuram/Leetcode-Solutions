class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=nums.length;
        int c=0,max=0;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                c++;
                if(c>max){
                    max=c;
                }
            }
            else{
                c=0;
            }
        }
        return max;
    }
}