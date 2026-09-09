class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int max =0;
        if(s==null||s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char rightChar= s.charAt(right);
            map.put(rightChar,map.getOrDefault(rightChar,0)+1);
            int k =right-left+1;
            while(map.size()<k){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.getOrDefault(leftChar,0)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
                k = right-left+1;
            }
            if(map.size()==k){
                max = Math.max(max,k);
            }
        }
        return max;
    }
}