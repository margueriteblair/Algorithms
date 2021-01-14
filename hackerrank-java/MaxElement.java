public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String instructions = scanner.next();
            if (instructions.equals("1")) {
                Integer itemToPush = Integer.parseInt(scanner.next());
                stack.push(itemToPush);
                maxList.add(itemToPush);
            } else if (instructions.equals("2")) {
                Integer remove = stack.pop();
                maxList.remove(new Integer(remove));
            } else {
                Collections.sort(maxList);
                System.out.println(maxList.get(maxList.size()-1));
            }
        }
    }
}