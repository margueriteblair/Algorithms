public class MinutesToSeconds {
    public static void main(String[] args) {
        
    }

	public static int minutesToSeconds(String tm) {
		String[] arr = tm.split(":");
		return (Integer.parseInt(arr[0])*60)+Integer.parseInt(arr[1]);
	}
}