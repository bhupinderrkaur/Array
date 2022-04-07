
/*Given a sorted array A containing N integers both positive and negative.

You need to create another array containing the squares of all the elements in A and return it in non-decreasing order.

Try to this in O(N) time.
*/


public class Solution {
    public int[] solve(int[] A) {
        int[]res=new int[A.length];
        int j=A.length-1;
        int i=0;
        int k=A.length-1;

        while(i<=j && k>=0 ){
            int x= Math.abs(A[i]);
            int y=Math.abs(A[j]);
            if(x>=y){
                res[k]=x*x;
                i++;
                k--;
            }
            else{
                res[k]=y*y;
                j--;
                k--;
            }
        }
    return res;
    }
}
