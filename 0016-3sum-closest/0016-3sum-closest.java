class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3){
            return 0;
        }
        int min_diff = Integer.MAX_VALUE;
        int ressum =0;
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                int diff= Math.abs(sum-target);
                if(min_diff>diff){
                    min_diff = diff;
                    ressum =sum;
                }
                if(sum==target){
                    return ressum;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ressum;
    }
}