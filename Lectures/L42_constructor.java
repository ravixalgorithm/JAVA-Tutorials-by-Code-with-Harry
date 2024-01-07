class MyMainEmployee{
    private int id;
    private String name;

    // Constructor Overloading
    public MyMainEmployee(){
        id = 45;
        name = "Ravi Pratap Singh";
    }

    public MyMainEmployee(String n){
        name = n;
    }

    public MyMainEmployee(int i,String n){
        name = n;
        id = i;
    }


    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int n){
        id = n;
    }
}

public class L42_constructor {
    public static void main(String[] args) {
        MyMainEmployee ravi = new MyMainEmployee(/*67,"Ravi"*/);

        // ravi.setId(34);
        // ravi.setName("Ravixalgorithm");

        System.out.println(ravi.getId());
        System.out.println(ravi.getName());
    }
}
