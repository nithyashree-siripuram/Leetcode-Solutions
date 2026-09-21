class Solution {
    public int minimumDifference(int[] nums, int k) {
        int len=nums.length;
        int min=Integer.MAX_VALUE;
        int sub=0;
        Arrays.sort(nums);
        for(int i=0;i<=len-k;i++){
            sub=nums[i+k-1]-nums[i];
            if(sub<min){
                min=sub;
            }
        }
        return min;
    }
}