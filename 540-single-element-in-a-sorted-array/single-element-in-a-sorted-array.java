class Solution {
    public int singleNonDuplicate(int[] arr) {
       int n=arr.length;
       if(n==1) return arr[0];
       if(arr[0]!=arr[1]) return arr[0];
       if(arr[n-1]!=arr[n-2]) return arr[n-1];
       int l=0;
       int r=n-1;
       while(l<=r){
        int mid=l+(r-l)/2;
        if(mid > 0 && mid < n-1 && arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) 
        return arr[mid];
        else if(mid > 0 && mid < n-1 && arr[mid-1]==arr[mid]){ //mid is the second occurrence here if this statement is true
            if(((mid-1)-l) %2==0)//checking for even or odd 
                l=mid+1;
            else
                r=mid-2;
        }
        else{ //mid is the first occurence here
             if((r-(mid+1))%2==0)//if odd imposter is there alone if even check for other side
                r=mid-1;
             else
               l=mid+2;
        }
       }
       return 0;
    }
}