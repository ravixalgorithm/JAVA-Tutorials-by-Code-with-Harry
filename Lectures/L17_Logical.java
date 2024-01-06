

public class L17_Logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
//        boolean c = true;
        if (a && b ){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println(" ");
        System.out.println("For Logical OR..");
        if (a||b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println(" ");
        System.out.println("For Logical NOT");
        System.out.println("Not(a) is "+ !a);
        System.out.println("Not(b) is "+ !b);
    }
}
