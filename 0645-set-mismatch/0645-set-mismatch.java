class Solution {
    public int[] findErrorNums(int[] nums) {
        if(nums==null || nums.length==1){
            return new int[]{};
        }
        long actualsum =0;
        long actualsumsq=0;
        long n = nums.length; 
        for(int num :nums){
            actualsum += num;
            actualsumsq += (long)num*num;
        }
        long expectedsum = n*(n+1)/2;
        long expectedsumsq = n*(n+1)*(2*n+1)/6;
        long diff1 = actualsum-expectedsum;
        long diff2 =actualsumsq- expectedsumsq;

        long sum = diff2/diff1;

        int duplicate = (int)(diff1+sum)/2;
        int missing = (int)sum-duplicate;

        return new int[]{duplicate,missing};
    }
}