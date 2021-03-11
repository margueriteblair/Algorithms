public class PascalsTriangle {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> generate(int numRows) {
        int j;
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        for(int i=0; i<numRows; i++){
            j=0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            
            while(j<=i){
                //if j is first or last element of list just set it to 0
                if(j==0 || j==i){
                    list.add(j,1);
                    j++;
                    continue;
                }
                //if j is middle element 
                //find previous list of result 
                List<Integer> l = result.get(i-1);
                //get two element of previous list add them and set them on j
                int m = l.get(j-1) + l.get(j);
                list.add(j,m);
                j++;
            }
            
            result.add(list);
            
        }
        return result;
        }
}