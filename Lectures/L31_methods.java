public class L31_methods {
    static int logic(int x , int y){
        int z;
        if (x>y) {
            z = x + y;
        } else {
            z = (x + y)*5;
        }
        x = 3443; // No change will occur while applying in main class
        return z;
        
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c;
        
        // if (a>b) {
        //     c = a + b;
        // } else {
        //     c = (a + b)*5;
        // }

        //Method invocation using Object Creation
        L31_methods fn = new L31_methods();
        c = fn.logic(a, b);
        // c = logic(a, b);


        int a1 = 3;
        int b1 = 1;
        int c1;
        // if (a1>b1) {
        //     c1 = a1 + b1;
        // } else {
        //     c1 = (a1 + b1)*5;
        // }
        c1 = logic(a1, b1);

        System.out.println(c);
        System.out.println(c1);
    }
    
}
