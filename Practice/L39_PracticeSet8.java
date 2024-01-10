import java.util.Scanner;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class Cellphone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
}

class Square{
    int side,area,perimeter;
    public void setSide(int n){
        side = n;
    }
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length,breadth,area,perimeter;
    public void setSide(int l,int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
    public int getPerimeter(){
        return 2*(length+breadth);
    }
}

class Circle{
    int radius,area,perimeter;
    public void setRadius(int n){
        radius = n;
    }
    public int getArea(){
        return 22/7*(radius*radius);
    }
    public int getPerimeter(){
        return 2*22/7*radius;
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing");
    }
}

public class L39_PracticeSet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1 -->
        Employee ravi = new Employee();
        ravi.setName("Ravi Pratap Singh");
        ravi.salary = 9870000;
        System.out.println(ravi.getName());
        System.out.println(ravi.getSalary());

        // Question 2 -->
        Cellphone f41 = new Cellphone();
        f41.ring();
        f41.vibrate();

        // Question 3 -->
        Square s1 = new Square();
        int s = sc.nextInt();
        s1.setSide(s);
        System.out.printf("Area of square = %d\n",s1.getArea());
        System.out.printf("Perimeter of square = %d\n",s1.getPerimeter());

        // Question 4 -->
        Rectangle r1 = new Rectangle();
        int l = sc.nextInt();
        int b = sc.nextInt();
        r1.setSide(l,b);
        System.out.printf("Area of square = %d\n",r1.getArea());
        System.out.printf("Perimeter of square = %d\n",r1.getPerimeter());

        // Question 6 -->
        Circle c1 = new Circle();
        int r = sc.nextInt();
        c1.setRadius(r);
        System.out.printf("Area of square = %d\n",c1.getArea());
        System.out.printf("Perimeter of square = %d\n",c1.getPerimeter());

        // Question 7 -->
        TommyVecetti ch = new TommyVecetti();
        ch.fire();
        ch.hit();
        ch.run();

    }
    
}
