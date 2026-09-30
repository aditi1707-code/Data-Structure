class Solution {
    public int mySqrt(int n) {
        // long arr[]= new int[x];
        // long n=arr.length;//vese to ek array banane ki zarroraat hi nhi hai
        long l=0;
        long r=n; //no n/2 as 1 ka root 1 hota hai 
        while(l<=r){
          long mid=(l+r)/2;
          if((mid*mid) ==n)
          return (int)mid;
          else if((mid*mid) >n)
            r=mid-1;
          else
          l=mid+1;
        }
        return (int)r;
    }
}