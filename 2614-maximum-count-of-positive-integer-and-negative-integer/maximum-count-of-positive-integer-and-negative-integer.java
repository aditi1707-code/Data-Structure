class Solution {
    public int maximumCount(int[] arr) {
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<=r){
          int mid=l+(r-l)/2;
          if(arr[mid]>=0) r=mid-1;
          else l=mid+1;
    } int c1=l;  //negative count
    l=0;
    r=n-1;
    while(l<=r){
        int mid=l+(r-l)/2;
        if(arr[mid]<=0) l=mid+1;
        else r=mid-1;
    }
    int c2=n-l; //positive count
    if(c1>c2)return c1;
    else return c2;
}}