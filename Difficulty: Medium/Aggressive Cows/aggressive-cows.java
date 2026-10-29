class Solution {
    boolean isPossible(int[] arr,int k,int dist){
        int n=arr.length;
        int cow=1;
        int lastPosition=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-lastPosition>=dist){
                lastPosition=arr[i];
                cow++;
            }
            if(cow>=k){
                return true;
            }
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int low=1;
        int high=arr[n-1]-arr[0];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}