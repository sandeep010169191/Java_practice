package Calc_pack;

import java.util.Scanner;

public class Calculator {
    public static int Addition(int number) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int storeNumber;
        for (int i = 0; i < number; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            storeNumber = sc.nextInt();
            sum += storeNumber;
        }
        return sum;
    }
}
