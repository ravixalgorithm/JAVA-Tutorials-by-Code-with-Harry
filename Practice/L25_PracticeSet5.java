import java.util.Scanner;

public class L25_PracticeSet5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Question 1 --> Print the Pattern
        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= n+1-i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        // Question 2 --> Print the Sum of first n even numbers using While Loop
        // int i = 0;
        // int sum = 0;
        // while(i<=n){
        //     sum = sum + (2*i);
        //     i++;
        // }
        // System.out.println(sum);

        // Question 3 --> Print the Multiplication table of n
        // int i = 1;
        // while(i<=10){
        //     System.out.println(n + " * " + i + " = " + n*i);
        //     i++;
        // }

        // Question 4 --> Print Multiplication table of n in reverse form
        // int i = 10;
        // while (i >= 1){
        //     System.out.println(n + " * " + i + " = " + n*i);
        //     i--;
        // }

        // Question 5 --> Find factorial of a given number Using For Loop
        // int fact = 1;
        // for(int i = 1; i<=n; i++){
        //     fact *= i;
        // }
        // System.out.println(fact);

        // Question 6 --> Do Ques.5 using while loop
        // int i = 1;
        // int fact = 1;
        // while(i<=n){
        //     fact = fact * i;
        //     i++;
        // }
        // System.out.println(fact);

        // Question 7 --> Do Ques.1 with while loop
        // int i = 1;
        // while(i<=4){
        //     int j = 1;
        //     while(j<=n-i+1){
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // Question 9 --> Sum of the numbers occuring in the multiplication table of 8
        // int sum = 0;
        // int i = 1;
        // while(i<=10){
        //     sum += n*i;
        //     i++;
        // }
        // System.out.println(sum);

        // Question 11 -->  Do Ques.2 with for loop
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum += 2*i;
        }
        System.out.println(sum);
    } 
}