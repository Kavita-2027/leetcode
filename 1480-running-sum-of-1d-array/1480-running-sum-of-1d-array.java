class Solution {
    public int[] runningSum(int[] nums) {
        if(nums==null ||nums.length==0){
            return new int[]{};
        }
        if(nums.length==1){
            return nums;
        }
        int runningsum =nums[0];
        int[] arr = new int[nums.length];
        arr[0] = runningsum;
        for(int i =1; i<nums.length;i++){
            runningsum += nums[i];
            arr[i]=runningsum;
        }
        return arr;
    }
}