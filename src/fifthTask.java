import java.util.Scanner;

public class fifthTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        double number = scanner.nextDouble();

        scanner.close();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number == 0) {
            System.out.println("Zero is neutral");
        }else {
            System.out.println(number + " is not a positive number");
        }

    }
}
