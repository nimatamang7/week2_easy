import java.util.Scanner;
public class ControlStatements {
    public static void main(String[] args)
{
        int num = 0;

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The numberis zero.");
        }
    }
}