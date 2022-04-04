public class Solution {
    public String solve(int A) {
        String str="";
        while(A>1){
           str = factorial(A,str);
           A--;
        }
        return str;
    }
    public String factorial(int num, String str){
        if(str.equals("")){
            return String.valueOf(num);
        }
        int carry=0;
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            int digit=str.charAt(i)-'0';
            int multiply=digit*num+carry;
            int mod=multiply%10;
             carry=multiply/10;

            ans=mod+ans;
        }
        if(carry!=0)
        ans=carry+ans;

        return ans;
    }
}
