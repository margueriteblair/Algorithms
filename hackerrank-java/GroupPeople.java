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
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList();
        
        for (int i = 0; i < groupSizes.length; i++) {
             List<Integer> list = map.get(groupSizes[i]);
            if (list == null) {
                list = new ArrayList<Integer>();
            } 
            
            list.add(i);
            if (list.size() == groupSizes[i]) {
                result.add(list);
                map.remove(groupSizes[i]);
            } else {
                map.put(groupSizes[i], list);
            }
        }
        
        return result;
    }
}