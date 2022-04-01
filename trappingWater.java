class Solution{
    // find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
   int water = 0;
    int start = 0, end = n - 1;
    int leftmax = 0, rightmax = 0;

    while(start < end){
            
        leftmax = Math.max(leftmax, arr[start]);
        rightmax = Math.max(rightmax, arr[end]);

        if(leftmax < rightmax)
            water += leftmax - arr[start++];
        
        else
            water += rightmax - arr[end--];
    }

    return water;
}}
