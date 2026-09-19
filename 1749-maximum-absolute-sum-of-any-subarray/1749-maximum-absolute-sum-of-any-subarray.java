class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = nums[0];
        int min =nums[0];
        int res =nums[0];
        for(int i =1;i<nums.length;i++){
            int v1= max+nums[i];
            int v2 = min+nums[i];
            int v3 = nums[i];
            max = Math.max(v3,Math.max(v1,v2));
            min = Math.min(v3,Math.min(v1,v2));
            res = Math.max(Math.abs(res),Math.max(Math.abs(max),Math.abs(min)));
        }
        return Math.abs(res);
    }
}