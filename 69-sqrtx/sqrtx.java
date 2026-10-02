class Solution {
    public int mySqrt(int n) {
        if(n==0) return 0;
        int l=1;
        int r=n; 
        while(l<=r){
          int mid=l+ (r-l)/2;
          if(mid==n/mid)//mid*mid karne pr bahut bada number ja raha int ke bas ki nhi toh divide
          return mid;
          else if(mid> n/mid)
            r=mid-1;
          else
          l=mid+1;
        }
        return r;
    }
}