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

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        Stack<Integer> maxValues = new Stack<Integer>();
        
        while(queries-- > 0) {
         switch(in.nextInt()) {
          case 1 : int item = in.nextInt();
            	   if (!maxValues.isEmpty()) {
                     item = item > maxValues.peek() ? item : maxValues.peek();
                   }
        	   maxValues.push(item);
                   break;
          case 2 : maxValues.pop();
                   break;
          case 3 : System.out.println(maxValues.peek());
                   break;
	 }
        }
        
        in.close();
    }
}