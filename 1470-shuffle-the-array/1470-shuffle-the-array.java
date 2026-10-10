class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums==null||n<1||nums.length==2){
            return nums;
        }
        int[] ans = new int[2*n];
        int left=0;
        int right =n;
        int i=0;
        while(i<2*n){
            ans[i]=nums[left];
            ans[i+1] = nums[right];
            i+=2;
            left++;
            right++;
        }
        return ans;
    }
}