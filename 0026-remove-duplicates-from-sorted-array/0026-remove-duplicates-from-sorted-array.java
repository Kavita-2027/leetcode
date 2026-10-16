class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums==null){
            return 0;
        }
        int off =0;
        int m =1;
        int unique =1;
        while(m<nums.length){
            if(nums[m]==nums[m-1]){
                m++;
            }else{
                nums[unique]= nums[m];
                m++;
                off++;
                unique++;
            }
            
        }
        int res = off+1;
        return res;
    }
}