public class Solution 
{
    public int solve(int[] A) 
    {
        if(A.length<=1)
         return 1;
        
        int EvenSum=0;
        int OddSum=0;
        
        int n = A.length;
        int count=0;
        
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
              EvenSum+=A[i];
            else
              OddSum+=A[i];    
        }
        
        
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                EvenSum-=A[i];
                if(EvenSum==OddSum)
                    count++;
                OddSum+=A[i];    
            }
            else
              {
                OddSum -=A[i];
                if(EvenSum==OddSum)
                 count++;
                EvenSum+=A[i]; //Same as Above
              }
        }
        
        return count;
        
         
    }
}
