public class mutations {
    public static void main(String[] args) {
        mutation("Alien", "line");
        mutation("hello", "hey");
    }

    public static void mutation(String target, String test) {
        //you can only use for loops on iterable instances and 
        target.toLowerCase();
        test.toLowerCase();
        String[] testArr = test.split("");
        for (String letter : testArr) {
            if (target.indexOf(letter) == -1) {
                System.out.println("false");
            } else {
                System.out.println("True");
            }
        }
    }
}