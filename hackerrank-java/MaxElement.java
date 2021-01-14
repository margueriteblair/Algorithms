public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        int maxElement = 0;
        for (int i = 0; i < N; i++) {
            String instructions = scanner.next();
            if (instructions.equals("1")) {
                Integer itemToPush = Integer.parseInt(scanner.next());
                stack.push(itemToPush);
            } else if (instructions.equals("2")) {
                stack.pop();
            } else {
                for (Integer item : stack) {
                    if (item > maxElement) maxElement = item;
                }
                System.out.println(maxElement);
            }
        }
    }
}