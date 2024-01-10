import java.util.*;

public class L15_PracticeSet3 {
    public static void main(String[] args) {

        System.out.println("Please Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();


        //Ques 1 --> Convert string to lowercase

        System.out.println("Your name in lowercase is "+ name.toLowerCase());


        //Ques 2 --> Replace " " to _

        System.out.println(name.replace(" ","_"));


        //Ques 3 --> Replace <|Name|> with some name

        String letter = "Dear <|Name|>, Thanks a lot";
        System.out.println(letter.replace("<|Name|>", name));


        //Ques 4 --> Detect Double or Triple spaces in a string
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

        // Practice set3 ques 4 (advanced program)👇🏻👇🏻👇🏻
        int c1 = name.indexOf("  ");
        int c2 = name.indexOf("   ");

        if (c2 != -1){
            System.out.println("Not Approved, triple spaces present");
        }
        else if (c1 != -1){
            System.out.println("Not Approved, double spaces present");
        }
        else{
            System.out.println("APPROVED,\nCongrats!!, No extra space");
        }


        //Ques 5 --> Format this letter template
        String myLetter = "Dear Ravi, \n\tThis Java Course is Amazing. \n\tThanks!!";
        System.out.println(myLetter);
    }
}
