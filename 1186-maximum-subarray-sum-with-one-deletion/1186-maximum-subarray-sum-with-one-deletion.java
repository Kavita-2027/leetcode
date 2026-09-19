class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = arr[0];
        int res = arr[0];
        if(arr.length==1){
            return arr[0];
        }
        for(int i =1;i<arr.length;i++){
            int prevnodelete = nodelete;
            nodelete = Math.max(nodelete+arr[i],arr[i]);
            onedelete = Math.max(prevnodelete,onedelete+arr[i]);
            res = Math.max(res,Math.max(onedelete,nodelete));
        }
        return res;

    }
}