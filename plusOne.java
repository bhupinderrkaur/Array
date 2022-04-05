public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	    
	    int size;
	    int carry = 1;
	    int num;
	    int sum=0;
	    size = A.size();
	    int i=size-1;
	    while(i>=0){
	        
	        num = A.get(i);
	        sum =num+ carry;
            int val=sum%10;
	        carry = sum/10; 
	        A.set(i, val);
	        i--;
	    }
	    
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    
	    if (carry == 1)
	        res.add(1);
	    
	    for (int x : A) {
	        if (x == 0 && res.size() == 0)
	            continue; //dont add 0 in the front of result
	        res.add(x);
	    }
	    
	    return res;
	    
	}
}
