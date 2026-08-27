class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int k = 2;
        int low = 0 ;
        int max = 0;
        for(int right=0; right <fruits.length;right++){
            freq.put(fruits[right],freq.getOrDefault(fruits[right],0)+1);
            while(freq.size()>k){
                freq.put(fruits[low],freq.getOrDefault(fruits[low],0)-1);
                
                if(freq.get(fruits[low])==0){
                    freq.remove(fruits[low]);
                }
                low++;
            }
            if(freq.size()==k || freq.size()<k){
                max = Math.max(max,right-low+1);
            }
            
        }
        return max;
    }
}