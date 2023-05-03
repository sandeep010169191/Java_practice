import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int i = 5;
            int j = 0;

            // Custom Exception
            if (j == 0) {
                throw new CustomExceptionDemo("Division by 0");
            }

            // // throw keyword
            // if (j == 0) {
            // throw new Exception("Division by 0");
            // }

            System.out.println("Result: " + (i / j));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int arr[] = new int[3];
        try {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i <= arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Integer i = null;
        try {
            int j = i.parseInt("sandeep");
            System.out.println(j);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
