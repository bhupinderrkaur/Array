public class Solution {
  //maxSum from both sides of B numbers
    public int solve(int[] A, int B) {
        int max=0;
        for(int i=0;i<B;i++){
            max+=A[i];
        }
        int start=B-1;
        int end=A.length-1;
        int sum=max;
        while(start>=0 && end<=A.length-1){
            sum=sum-A[start];
            start--;
            sum=sum+A[end];
            end--;
            max=Math.max(max,sum);
        }
        return max;

    }
}
