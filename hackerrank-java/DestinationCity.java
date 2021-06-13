public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        String destination = "";
        for (int i = 0; i < paths.size(); i++) {
            if (isntFirst(paths, paths.get(i).get(1))) {
                destination = paths.get(i).get(1);
                return paths.get(i).get(1);
            }
        }
        return destination;
    }
    
    public boolean isntFirst(List<List<String>> paths, String city) {
        for (int i = 0; i < paths.size(); i++) {
            if (paths.get(i).get(0).equals(city)) {
                return false;
            }
        }
        return true;
    }
}