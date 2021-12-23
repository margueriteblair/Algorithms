public class MinutesToSeconds {
    public static void main(String[] args) {
        
    }
	public static int minutesToSeconds(String tm) {
		String[] arr = tm.split(":");
		if (Integer.parseInt(arr[1]) > 59) {
			return -1;
		}
		return (Integer.parseInt(arr[0])*60)+Integer.parseInt(arr[1]);
	}
}