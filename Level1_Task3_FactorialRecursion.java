import java.util.Scanner;

public class Level1_Task3_FactorialRecursion {
    
    static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Factorial Calculator ===");
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        try {
            long result = factorial(num);
            System.out.println("Factorial of " + num + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
