import java.util.Scanner;

public class L35_PracticeSet7 {
    static void table(int n){
        for(int i = 1; i<= 10; i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static int sumOfNaturalNumbers(int n){
        if(n==1){
            return 1;
        }else{
            return n+sumOfNaturalNumbers(n-1);
        }
    }
    static void pattern2(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static int fib(int n){
        if(n==1 || n == 2){
            return (n-1);
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    static float avg(int ...arr){
        float sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum/arr.length;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println(" ");
        // Question 1 --> Write a method to print Multiplication Table
        // table(n);

        // Question 2 --> Print a pattern
        // pattern1(n);

        // Question 3 --> Write a recursive function to add n natural numbers
        // int sum = sumOfNaturalNumbers(n);
        // System.out.printf("Sum of first %d natural numbers = %d",n,sum);

        // Question 4 --> Print a pattern
        // pattern2(n);

        // Question 5 --> nth term of fibonacci Series
        // System.out.printf("%dth term of fibonacci series = %d",n,fib(n));

        // Question 6 --> Average using VarArgs
        // System.out.println("Avg = " + avg(2,5,3));

        // Question 7 --> To convert celsius to Fahrenheit

        // Question 8 --> repeat 2 using Recursion
        
        // Question 9 --> repeat 4 using Recursion

        // Question 10 --> repeat 3 using iterative approach


    }
    
}
