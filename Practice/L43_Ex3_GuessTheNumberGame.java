import java.util.Random;
import java.util.Scanner;

class Game{
    int userInput;
    int computerChoice;
    public int diff( int a, int b){
        if(a>b){
            return a-b;
        }
        else{
            return b-a;
        }
        }

    public void computerChoice(int n){
        computerChoice = n;
        System.out.println(computerChoice);
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choice : ");
        int userInput = sc.nextInt();
    }
    
    public void isCorrectNumber(){

        if (computerChoice == userInput) {
            System.out.println("Matched");
        } 
        else{
            System.out.println("you are Close");
            if(userInput>computerChoice){
                System.out.println("Choose a number lower");
            }
            else{
                System.out.println("Choose a number higher");
            }
            
        }
    }

}



public class L43_Ex3_GuessTheNumberGame {
    public static void main(String[] args) {
        /*
            *Create a Class Game, Which allows a user to play "Guess the number" game once.
            *Game should have the following methods:-
            *1. Constructor to generate the random number
            *2. takeUserInput() to take a user input of number
            *3. isCorrectNumber() to detect whether the number entered by the user is true 
            !4. getter and setter for noOfGuesses
            !Use properties such as noOfGuesses(int), etc to get this task done!!
        */
        Game g = new Game();
        Random rc = new Random();
        int x = rc.nextInt(100);
        g.computerChoice(x);
        g.takeUserInput();
        g.isCorrectNumber();
    }

}
