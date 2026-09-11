class Solution {
    public int characterReplacement(String s, int k) {
         int[] freq = new int[26];
         int left =0;
         int maxcount =0;
         int maxlen =0;
         for(int right =0;right<s.length();right++){
            char rightChar = s.charAt(right);
            freq[rightChar-'A']++;
            maxcount = Math.max(maxcount,freq[rightChar-'A']);
            if((right-left+1)-maxcount>k){
                char leftChar = s.charAt(left);
                freq[leftChar-'A']--;
                left++;
            } 
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;

    }
}