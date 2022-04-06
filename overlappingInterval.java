public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> arr) {
        Collections.sort(arr,new Comparator<Interval>(){
            @Override
            public int compare(Interval a, Interval b){
                if(a.start!=b.start)
                return a.start-b.start;
                else
                return a.end-b.end;
            }
        });
        int s,e;
        ArrayList<Interval> res=new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            Interval first=arr.get(i);
            Interval sec=arr.get(i+1);

            if(first.end<sec.start)
            res.add(first);
            else{
                 first.start= Math.min(first.start,sec.start);
                 first.end=Math.max(first.end,sec.end);
                 arr.remove(i+1);
                 i--;
            }
        }
        res.add(arr.get(arr.size()-1));
        return res;
    }
}
