import java.util.Scanner;

public class fourthTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number1 = scanner.nextInt();

        System.out.println("Type another number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println("Sum of the given numbers is "+ sum);
    }
}
