class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n<2 || n%2!=0){
            return false;
        }
        int target = n/2;
        int a =1;
        int b =2;
        if(target==a){
            return true;
        }
        while(b<=target){
            if(b==target){
                return true;
            }
            int next = a+b;
            a = b;
            b = next;
        }
        return false;
    }
}