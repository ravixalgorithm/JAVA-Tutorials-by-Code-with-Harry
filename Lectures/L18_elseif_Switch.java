import java.util.Scanner;

public class L18_elseif_Switch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       //Switch Case

       //Traditional Switch case
       switch (str){
           case "Dev":
               System.out.println("Nice Name");
               break;
           case "Dhruv":
               System.out.println("Amazing");
               break;
           case "Simran":
               System.out.println("Womennn");
               break;
           default:
               System.out.println("Enjoy!!");
       }

       //Enhanced Switch Case
       switch(str){
        case "Dev" -> System.out.println("Nice Name");
        case "Dhruv" -> System.out.println("Amazing");
        case "Simran" -> System.out.println("Womennn");
        default -> System.out.println("Enjoy!!");
       }
       System.out.println("Thank You!!");




        //Else - If Statement
//        System.out.print("Enter Your Age: ");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age>56){
//            System.out.println("You are Experienced");
//        }
//        else if(age>46){
//            System.out.println("You are Semi-Experienced");
//        }
//        else if(age>36){
//            System.out.println("You are Semi-Semi-Experienced");
//        }
//        else{
//            System.out.println("You are not Experienced");
//        }
    }
}
