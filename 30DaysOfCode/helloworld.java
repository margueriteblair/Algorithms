import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a line of text: ");
        String inputString = scan.nextLine();
        scan.close();

        System.out.println("Hello, World");
        System.out.println(inputString);
    }
}