public class Solution {
    public int solve(int A, int[] arr) {
        int sum=0;
        for(int i:arr)
        sum+=i;
        if(sum%3!=0) return 0;

        sum=sum/3;
        int tempsum=0;
        //suffix array
        int[] suff=new int [A];
        for(int i=A-1;i>=0;i--){
            tempsum+=arr[i];
            if(tempsum==sum)
            suff[i]=1;
            else
            suff[i]=0;
        }
        tempsum=0;
        int c=0;
        int j=0;
        for(int i=0;i<A;i++){
            tempsum+=arr[i];
            if(tempsum==sum){
                for(j=i+2;j<A;j++){
                    if(suff[j]==1)
                    c++;
                }

            }
        }
    return c;
    }
}
