class Solution {
      public int Sqrt(long n) {
        if(n==0) return 0;
        long l=1;
        long r=n; 
        while(l<=r){
          long mid=l+ (r-l)/2;
          if(mid==n/mid)//mid*mid karne pr bahut bada number ja raha int ke bas ki nhi toh divide
          return (int)mid;
          else if(mid> n/mid)
            r=mid-1;
          else
          l=mid+1;
        }
        return (int)r;
    }
    public int arrangeCoins(long n) {
        return((int)Sqrt(8*n+1)-1)/2; 
    }
}