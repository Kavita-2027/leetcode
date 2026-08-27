class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> substring = new HashMap<>();
        int left =0;
        
        int max = 0;
        if(s== null|| s.length()==0){
            return 0;
        }
        
        for(int right=0;right<s.length();right++){
            char rightChar = s.charAt(right);
            substring.put(rightChar,substring.getOrDefault(rightChar,0)+1);
            int k = right-left+1;
            while(substring.size()<k){
                char leftChar = s.charAt(left);
                substring.put(leftChar,substring.getOrDefault(leftChar,0)-1);
                if(substring.get(leftChar)==0){
                    substring.remove(leftChar);
                }
                left++;
                k = right-left+1;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}