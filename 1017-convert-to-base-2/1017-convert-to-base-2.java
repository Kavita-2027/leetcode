class Solution {
    public String baseNeg2(int n) {
        if(n==0){
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while(n!=0){
            int reminder = n%-2;
            n /=-2;
            if(reminder<0){
                reminder +=2;
                n +=1;
            }
            binary.append(reminder);
        }
        
        
        return binary.reverse().toString();

    }
}