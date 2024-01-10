import java.util.Scanner;

public class L6_Ex1_CbsePercentageCalculator {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Calculate your percentage now with this amazing Percentage calcutor");
        System.out.println("                              -Made by Mr.ALGORITHM @ravixalgorithm");
        System.out.println(" ");
        System.out.println("Enter your Numbers of each subject (out of 100)");

            Scanner sc = new Scanner(System.in);
            System.out.print("Chemistry: ");
            float chem = sc.nextFloat();
            System.out.print("Mathematics: ");
            float maths = sc.nextFloat();
            System.out.print("Physics: ");
            float phy = sc.nextFloat();
            System.out.print("English: ");
            float eng = sc.nextFloat();
            System.out.print("Physical Education: ");
            float pe = sc.nextFloat();

            float sum = pe+eng+phy+maths+chem;

            if (sum<=500){
                float percentage = sum*100/500;
                System.out.println("Your Percentage : "+ percentage);

                if (percentage<=40 || maths<=33 || phy <= 33 || chem<= 33 || pe<=33 || eng<=33){
                    System.out.println(" ");
                    System.out.println("SORRY to tell, But you FAILED!!!");
                    System.out.println(" ");
                    System.out.println("You might not been able to clear any of these conditions- \n1)Total percentage >=40 \nOR \n2)Subjectwise marks >=33");
                    System.out.println(" ");
                    System.out.println("DON'T worry and start preparing again");
                    System.out.println(" ");
                    System.out.println("Hope for a bright future ahead...");
                }
                else{
                    System.out.println(" ");
                    System.out.println("Congratulations!!!!, you PASSED the Exam");
                }

            }
            else{
                System.out.println(" ");
                System.out.println("Please!!, Enter valid Marks (Out of 100)");
                System.out.println("Your Percentage = --ERROR--");
            }
            System.out.println(" ");
            System.out.println("Thanks for using our calculator");
        }
}

