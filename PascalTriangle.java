public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < A; i++){ //traverse row
            ArrayList <Integer> ar = new ArrayList<>(); //make new row for every iteration
            
            for(int j = 0; j <= i; j++){ //traverse column
                if(j == 0 || j == i){ 
                    ar.add(1); //first and last column be 1
                } else {
                    ar.add(ans.get(i - 1).get(j-1) + ans.get(i - 1).get(j)); //add in row
                }
            }
            ans.add(ar); //add row in matrix
        }
        return ans;
    }
}
