class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> nestedlist = new ArrayList<>();
        if(nums==null||nums.length<3){
            return nestedlist;
        }
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            int target = -nums[i];
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum==target){
                    nestedlist.add(List.of(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]== nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum<target){
                    left++;
                }else if(sum>target){
                    right--;
                }
            }

        }
        return nestedlist;
    }
}