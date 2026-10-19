class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x>=0 && x<10){
            return true;
        }
        int temp = x;
        int res = 0;
        while(temp!=0){
            int digit = temp%10;
            res = res*10+digit;
            temp = temp/10;
        }
        return res==x? true:false;
    }
}