class Solution {
    public int maxSubArray(int[] nums) {
        int low =0;
        int sum =0;
        int maxsum =Integer.MIN_VALUE;
        for(int high =0;high<nums.length;high++){
            sum += nums[high];
            maxsum = Math.max(maxsum,sum);
            if(sum<0){
                sum =0;
                low = high+1;
            }
        }
        return maxsum;
    }
}