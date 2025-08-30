class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left=0;
        int n=arr.length;
        int right=n-1;
        
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            
            left++;
            right--;
        
        }
        return;
    }
}