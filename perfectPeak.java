public class Solution {
    public int perfectPeak(int[] a)
    {   int n=a.length;
       //rightmin array
        int[]rm=new int [n];
        rm[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            rm[i]=Math.min(rm[i+1],a[i]);
        }
        int lmax=a[0];
        for(int i=0;i<n-1;i++){
            if(a[i]>lmax && a[i]<rm[i+1]){
                return 1;
            }
            lmax=Math.max(lmax,a[i]);
            
        }
        
        return 0;
    }
}
