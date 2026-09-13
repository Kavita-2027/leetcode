class Solution {
    public boolean checkIfPangram(String sentence) {
        char x ='a';
        for(char i=x;i<x+26;i++){
            if(sentence.indexOf(i)==-1){
                return false;
            }
        }
        return true;
    }
}