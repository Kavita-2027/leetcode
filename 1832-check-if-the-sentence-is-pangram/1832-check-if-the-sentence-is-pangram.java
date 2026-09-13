class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] visited = new boolean[26];
        if(sentence.length()<26){
            return false;
        }
        for(int i =0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(ch >='a'&& ch<='z'){
                visited[ch-'a']=true;

            }
            if(ch>='A' && ch<='Z'){
                visited[ch-'A']=true;
            }
        }
        for(int i =0;i<26;i++){
            if(visited[i]==false){ 
                return false;
            }
        }
        return true;
    }
}