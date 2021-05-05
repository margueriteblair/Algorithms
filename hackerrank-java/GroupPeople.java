public class GroupPeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap();
        List<List<Integer>> result = new ArrayList();
        
        int index = 0;
        for (int size: groupSizes) {
            List<Integer> list = map.get(size);
            
            if (list == null) {
                list = new ArrayList<Integer>();
            }
            
            list.add(index);

            if (list.size() == size) {
                result.add(list);
                map.remove(size);
            } else {
                map.put(size, list);
            }
            
            index++;
        }
        return result;
    }

    public List<List<Integer>> groupThePeople2(int[] groupSizes) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
    }
}