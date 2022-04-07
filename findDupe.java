/*Given a read only array of
n + 1 integers between 1 and n, find one number that repeats in linear time 
using less than O(n) space and traversing the stream sequentially O(1) times.
*/

public class Solution {
    public int repeatedNumber(final int[] A) {
        for(int i=1;i<=A.length;i++){
            int z=Math.abs(A[i-1]);
            int x = A[z];
            if(x>0)
                A[z]=-Math.abs(A[z]);
            
            else return Math.abs(A[i-1]);

        }
        return -1;
    }
}
