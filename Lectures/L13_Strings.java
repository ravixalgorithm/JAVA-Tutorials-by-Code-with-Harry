
import java.util.Scanner;

public class L13_Strings {

    public static void main(String[] args) {

        //Two ways of assigning a String:-

//        String name = new String("Harry"); //Method 1
        String name = "Harry"; //Method 2
        System.out.println("The name is "+name);


        //Different type of Print functions:-

        int a = 6;
        float b = 5.47348f;

        System.out.printf("The value of a is %d, The value of b is %8.2f", a,b); //here 8.2 declare that only 2 digit after decimal to print and a     total of 8 digits to print
        System.out.format("The value of a is %d, The value of b is %f", a,b);


        System.out.print("Enter you name: ");
        Scanner sc = new Scanner(System.in);
//        String st = sc.next(); //Read first word only
        String st = sc.nextLine(); //Read Whole Line
        System.out.println(st);

    }
}

