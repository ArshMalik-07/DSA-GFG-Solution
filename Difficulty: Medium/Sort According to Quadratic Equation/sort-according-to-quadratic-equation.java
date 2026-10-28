class Solution {
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        // Code here
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            int j=((A*(arr[i]*arr[i]))+(B*(arr[i]))+C);
            temp[i]=j;
        }
        Arrays.sort(temp);
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(temp[i]);
        }
        return res;
    }
}