import java.util.*;
public class L23_For_Loop{
    public static void main(String[] args) {
        // for(int i = 1; i<=10; i++){
        //     System.out.println(i);
        // }

        // 2i = Even numbers = 0,2,4,6,...
        // 2i+1 = Odd numbers = 1,3,5,7,...

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();


        // Incrementing For Loop
        // for(int i = 0; i<=n; i++){
        //     System.out.println(2*i+1);
        // }

        //Decrementing For Loop
        for(int i=n; i>0; i--){
            System.out.println(i);
        }
    }
}