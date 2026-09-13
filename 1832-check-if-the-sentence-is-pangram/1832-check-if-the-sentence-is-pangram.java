class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> seen = new HashSet();
        for(char ch : sentence.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                seen.add(ch);
            } 
        }
        return seen.size()==26;
    }
}