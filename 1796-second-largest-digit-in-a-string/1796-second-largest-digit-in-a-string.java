class Solution {
    public int secondHighest(String s) {
        int count =0;
        for(char ch ='9';ch>='0';ch--){
            if(s.indexOf(ch)!=-1){
                count++;
                if(count==2){
                    return ch-'0';
                }
            }
            
        }
        return -1;
    }
}