class Solution {
    public int minimumDifference(int[] nums, int k) {
        int len=nums.length;
        int min=Integer.MAX_VALUE;
        int sub=0;
        // Arrays.sort(nums);
        // for(int i=0;i<=len-k;i++){
        //     sub=nums[i+k-1]-nums[i];
        //     if(sub<min){
        //         min=sub;
        //     }
        // }
        if(len==1) return 0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                sub=Math.abs(nums[j]-nums[i]);
                if(sub<min){
                    min=sub;
                }
            }

        }
        return min;
    }
}