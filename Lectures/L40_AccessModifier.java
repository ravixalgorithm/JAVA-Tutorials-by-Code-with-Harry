class MyEmployee{
    private int id;
    private String name;

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

public class L40_AccessModifier{
    public static void main(String[] args) {
        MyEmployee ravi = new MyEmployee();
        // ravi.id = 45;
        // ravi.name = "Ravi Pratap Singh";
        ravi.setId(45);
        ravi.setName("Ravi Pratap Singh");
        System.out.println(ravi.getId());
        System.out.println(ravi.getName());
    }
}