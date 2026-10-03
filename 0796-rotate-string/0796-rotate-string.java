class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(n!=m){
            return false;
        }else{
            s= s+s;
            return s.contains(goal);
        }
    }
}