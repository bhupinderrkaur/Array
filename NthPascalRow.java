public class Solution {
    public int[] getRow(int A) {
        int []res=new int[A+1]; //A is row number
        for(int i=0;i<=A;i++){
            res[i]=func(A,i); 
        }
        return res;
    }
    public int func(int n, int k){
        if(k==0 || k==n) return 1;
        if(k>n-k) k=n-k;
        int p=1;
        for(int i=0;i<k;i++){
            p=p*(n-i);
            p=p/(i+1);
        }
        return p;
    }
}
