class Solution {
    public int search(int[] a, int target) {
      int n=a.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==target) return mid;
            //left half sorted
            else if(a[l]<=a[mid]){
                if(a[l]<=target && target<a[mid]) r=mid-1;
                else l=mid+1;
            }
            // right half sorted
            else{
                if(a[mid]<target && target<=a[r]) l=mid+1;
                else r=mid-1;
            }
        }
        return -1;
    }
}