public class Solution {
    public int solve(int[] a) {
        int max=0;
        int n=a.length;
        int[]suff=new int[n];
        suff[n-1]=a[n-1];
        //suffix right arr
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.max(suff[i+1],a[i]);
        }
        //TreeSet to get max value less than ith value
        TreeSet<Integer> left=new TreeSet<>();
        left.add(a[0]);
        for(int i=1;i<n-1;i++){
            int second=a[i];
            Integer first=left.lower(second);
            int third=suff[i+1];
            if(first!=null && first<second && second<third){
                max=Math.max(max,first+second+third);
            }
            left.add(a[i]);
        }
        return max;
    }
}
