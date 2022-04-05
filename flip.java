public class Solution {
    public int[] flip(String A) {
        char [] a= A.toCharArray();
        int c0=0;
        int maxl=-1;
        int l=0;
        int maxr=-1;
        int max=0;
        for(int i=0;i<a.length;i++){
            int x=a[i]-'0';
            if(x==0){
                c0++;
            } 
            else c0--;
            if(c0>max){
                max=c0;
                maxl=l;
                maxr=i;
            }
            if(c0<0){
                c0=0;
                l=i+1;
            }

        }
        int[] res=new int[2];
        if(maxl==-1 && maxr==-1)
        return new int[0];

        res[0]=maxl+1;
        res[1]=maxr+1;
        return res;

    }
}
