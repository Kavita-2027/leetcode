class Solution {
    public int removeDuplicates(int[] nums) {
        int off=0;
        int cm =1;
        int unique =1;
        while(cm<nums.length){
            if(nums[cm]==nums[cm-1]){
                cm++;
            }else{
                nums[unique]=nums[cm];
                cm++;
                off++;
                unique++;
            }
        }
        return off+1;
    }
}