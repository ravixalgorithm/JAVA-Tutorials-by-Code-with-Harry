import java.util.Scanner;

public class L22_Quiz_PrintUsingDo_WhileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}