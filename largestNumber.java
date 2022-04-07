public class Solution {
    public String largestNumber(final List<Integer> A) {
        String[]arr=new String[A.size()];
        for(int i=0;i<A.size();i++){
            arr[i]=A.get(i)+"";
        }
        Arrays.sort(arr,(a,b)->{
            long n1=Long.parseLong(a+b);
            long n2=Long.parseLong(b+a);
            if(n1>n2)
            return 1;
            else if(n2>n1)
            return -1;
            else return 0;
        });
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
         if(sb.charAt(0) == '0'){     //check if all zeroes are there
        return String.valueOf(0);
    }
        return sb.toString();
    }
}
