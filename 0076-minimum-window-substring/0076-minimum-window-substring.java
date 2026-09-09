class Solution {
    public String minWindow(String s, String t) {
        if(s == null||t==null||s.length()<t.length()){
            return "";
        }
        int[] need = new int[128];
        for(char c:t.toCharArray()){
            need[c]++;
        }
        int left =0;
        int right=0;
        int minlen = Integer.MAX_VALUE;
        int required =t.length();
        int startIndex =0;

        while(right<s.length()){
            char rightCount = s.charAt(right);

            if(need[rightCount]>0){
                required--;
            }
            need[rightCount]--;
            right++;
            while(required == 0){
                if(right-left<minlen){
                    minlen =right-left;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                need[leftChar]++;
                if(need[leftChar]>0){
                    required++;

                }
                left++;

            }
        }
        return minlen == Integer.MAX_VALUE ? "":s.substring(startIndex,startIndex+minlen);
    }
}