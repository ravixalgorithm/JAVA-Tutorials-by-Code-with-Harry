import java.util.Random;
import java.util.Scanner;

public class L20_Ex2_RockPaperScissorsGame{
    public static void main(String[] args) {
        System.out.println("  ");
        System.out.println("Choose- \n0 for Scissor \n1 for Rock\n2 for Paper");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choice : ");
        int userInput = sc.nextInt();

        Random rn = new Random();
        int computerChoice = rn.nextInt(3);

            if (userInput>=0 && userInput<=2) {
            System.out.println("Computer chooses : "+ computerChoice);

                if (userInput == computerChoice){
                    System.out.println("It's a tie!");
                }
                else if ((userInput == 0 && computerChoice == 2) || (userInput == 1 && computerChoice == 0) || (userInput == 2 && computerChoice == 1)){
                    System.out.println("Congrats, You win");
                }
                else if ((userInput == 0 && computerChoice == 1) || (userInput == 1 && computerChoice == 2) || (userInput == 2 && computerChoice ==0)) {
                    System.out.println("You Lose !!");
                }
                }
            else{
                System.out.println("Please, Enter a valid Choice");
            }
            
            
        
        
        
        
        

    }
    
}