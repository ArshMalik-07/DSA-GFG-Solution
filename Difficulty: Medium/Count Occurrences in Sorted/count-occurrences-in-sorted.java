class Solution {
    public int findFirst(int[] arr,int target){
            int n=arr.length;
            int low=0;
            int high=n-1;
            int ans=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==target){
                    ans=mid;
                    high=mid-1;
                }
                else if(arr[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }    
            return ans; 
        }
        public int findLast(int[] arr,int target){
            int n=arr.length;
            int low=0;
            int high=n-1;
            int ans=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==target){
                    ans=mid;
                    low=mid+1;
                }
                else if(arr[mid]<target){
                    low=mid+1;
                }
                else{
                     high=mid-1;
                }
            }
            return ans;
        }
    int countFreq(int[] arr, int target) {
        int first=findFirst(arr,target);
        int last=findLast(arr,target);
        if(first==-1){
            return 0;
        }
               return last-first+1;
    }
}
