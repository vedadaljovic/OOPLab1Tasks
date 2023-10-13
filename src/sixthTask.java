import java.util.Scanner;
public class sixthTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Type the second number: ");
        double number2 = scanner.nextDouble();

        scanner.close();

        if (number1 > number2) {
            System.out.println("The greater number is " + number1);
        }else if (number2 > number1) {
            System.out.println("The greater number is " + number2);
        }else {
            System.out.println("Both numbers are equal!");
        }
    }
}
