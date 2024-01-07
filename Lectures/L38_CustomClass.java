class Employee{
    int id;
    String name;
    int salary;
    public void getDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class L38_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our Custom class");
        Employee Ravi = new Employee(); //Instantiating a new employee obj
        Employee Lakshya = new Employee(); //Instantiating a new employee obj

        // Setting Attributes for Harry
        Ravi.id = 1;
        Ravi.name = "Ravi Pratap Singh";
        Ravi.salary = 79800;

        //Setting Attributes for Lakshya
        Lakshya.id = 2;
        Lakshya.name = "Lakshya Baranwal";
        Lakshya.salary = 79800;

        //Printing Attributes
        Ravi.getDetails();
        System.out.println(" ");
        Lakshya.getDetails();
        int salary = Lakshya.getSalary();
        System.out.printf("Salary = %d\n",salary);
        
    }
}
