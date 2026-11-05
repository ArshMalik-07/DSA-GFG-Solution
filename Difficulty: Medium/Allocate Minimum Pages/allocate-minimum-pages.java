class Solution {
    boolean student(int [] arr,int n,long limit,int student){
        int k=1;
        long page=0;
        for(int i=0;i<n;i++){
            if(page+arr[i]<=limit){
                page=page+arr[i];
            }
            else{
                k++;
                page=arr[i];
                if(k>student){
                    return false;
                }
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(n<k){
            return -1;
        }
        long low=0;
        long high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        long res=-1;
        while(low<=high){
            long mid=(low+high)/2;
            if(student(arr,n,mid,k)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)res;
    }
}