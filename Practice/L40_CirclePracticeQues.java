import java.util.Scanner;

class Circle{
    int radius,perimeter,area;
    public void setRadius(int n){
        radius = n;
    }
    public void setPerimeter(int n){
        perimeter = n;
    }
    public void setArea(int n){
        area = n;
    }
    public void getPerimeter(){
        int peri = (2*22*radius)/7;
        if(peri == perimeter){
            System.out.println("Calculated Perimeter = User Given perimeter = "+peri);
        }
        else{
            System.out.println("ERROR!!,Calculated and Entered Perimeter not Matched,Correct Answer = "+peri);
        }

    }
     public void getArea(){
        int ar = (22*radius*radius)/7;
        if(ar == area){
            System.out.println("Calculated Area = User Given Area = "+ar);
        }
        else{
            System.out.println("ERROR!!,Calculated and Entered Area not Matched,Correct Answer = "+ar);
        }

    }
}

public class L40_CirclePracticeQues {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius = ");
        int r =sc.nextInt();
        System.out.print("Submit your Perimeter = ");
        int p =sc.nextInt();
        System.out.print("Submit your Area = ");
        int a =sc.nextInt();

        c.setRadius(r);
        c.setPerimeter(p);
        c.setArea(a);

        System.out.println(" ");
        
        c.getPerimeter();
        System.out.println(" ");
        c.getArea();
    }
}
