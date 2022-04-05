public class Solution {
    public int solve(int[] A, int B) {
        boolean found=false;
        int i=0;
        int l=0;
        int n=A.length;
        int c=0;
        int r=0;
        while(i<n){
            r=Math.min(i+B-1,n-1);
            l=Math.max(i-B+1,0);
            found=false;
            while(l<r){
                if(A[r]==1){
                    found=true;
                    c++;
                    break;
                }
            
             r--;
            }
             if(found==false)
             return -1;
             i=r+B;
        }
       
   return c; }
}
