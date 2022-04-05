public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] a) {
      
        int max=Integer.MIN_VALUE; //coz negative elements modified
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=Math.max(sum+a[i],a[i]);
            max=Math.max(max,sum);
        }
    return max;
    }
}
