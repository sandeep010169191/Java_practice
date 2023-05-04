import Calc_pack.*;
import java.util.*;

public class mainCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Calculator-----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("How many numbers you want to add?\n");
                int noOfNumbers = sc.nextInt();
                int sum = Calculator.Addition(noOfNumbers);
                System.out.println("Sum: " + sum);
                break;
        }
        sc.close();
    }
}
