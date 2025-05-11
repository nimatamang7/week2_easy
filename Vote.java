
import java.util.Scanner;
public class Vote {
    public static void main(String[] args)
    {
        int age;

        System.out.println("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
