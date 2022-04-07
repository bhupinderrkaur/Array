public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
    //in place sol
        //transpose
        for(int i=0;i<a.size();i++){
            for(int j=i;j<a.size();j++){
               Integer swap=a.get(i).get(j);
               a.get(i).set(j,a.get(j).get(i));
               a.get(j).set(i,swap);
            }
        }
        //reverse columns by row
        for(int i = 0; i < a.size(); i++) Collections.reverse(a.get(i));
	}
}
