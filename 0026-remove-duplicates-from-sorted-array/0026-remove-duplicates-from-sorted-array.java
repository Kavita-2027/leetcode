class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int off=0;
        int m =1;
        int unique=1;
        while(m<nums.length){
            if(nums[m]==nums[m-1]){
                m++;
            }else{
                
                nums[unique]=nums[m];
                off++;
                m++;
                unique++;
            }
        }
        return unique;
    }
}