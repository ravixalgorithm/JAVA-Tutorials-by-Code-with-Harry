import java.util.Scanner;

public class L34_Recursion {
    // factorial(n) = n*n-1*.....*1;
    // factorial(5) = 5*4*3*2*1 = 120;

    // With Recursion
    static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
    // Without Recursion
    static int factorial_Iterative(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            int product = 1;
            for(int i = 1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of "+ n + " = " + factorial(n));
        System.out.println("Factorial of "+ n + " = " + factorial_Iterative(n));
    }
}
