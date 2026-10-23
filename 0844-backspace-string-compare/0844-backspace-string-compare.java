class Solution {
    public boolean backspaceCompare(String s, String t) {
        return Stringres(s).equals(Stringres(t));
        
    }
    String Stringres(String str){
        StringBuilder S = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch !='#'){
                S.append(ch);
            }else if(S.length()>0){
                S.deleteCharAt(S.length()-1);
            }
        }
        return S.toString();
    }

    
}