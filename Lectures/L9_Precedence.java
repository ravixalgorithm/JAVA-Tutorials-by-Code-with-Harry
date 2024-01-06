

public class L9_Precedence {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        /*
        Hishest precedence goes to * & /
        They are then evaluated on the basis of left to write assciativity
           = 30 - 17
           = 13
         */
        int b = 60/5-34*2;
        /*
           = 12 - 68
           = -56
         */

        System.out.println(a);
        System.out.println(b);
        //Precedence & Associativity

    }
}
