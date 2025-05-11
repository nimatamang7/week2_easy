import java.util.Scanner;
public class SimpleOperation {
    public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();

    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    int result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is "+ result);
        } else if(operator == '-') {
            result = num1 - num2;
            System.out.println("The difference of " + num1 + " and " + num2 + " is "+ result);
}else if(operator == '*') {
    result = num1 * num2;
    System.out.println("The product of " + num1 + " and " + num2 + " is "+ result);
}else if(operator == '/') {
    result = num1 / num2;
    if (num2 == 0) {
        System.out.println("Error! " );
    }else{
    System.out.println("The quotient of " + num1 + " and " + num2 + " is "+ result);
}
}
}
}