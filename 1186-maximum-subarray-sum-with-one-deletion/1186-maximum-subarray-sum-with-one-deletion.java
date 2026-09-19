class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];
        for(int i =1;i<arr.length;i++){
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;
            nodelete = Math.max(nodelete+arr[i],arr[i]);
            int v;
            if(onedelete == Integer.MIN_VALUE){
                v = arr[i]; 
            }else{
                v = onedelete+arr[i];
            }
            onedelete = Math.max(prevnodelete,v);
            res = Math.max(res,Math.max(onedelete,nodelete));
        }
        return res;

    }
}