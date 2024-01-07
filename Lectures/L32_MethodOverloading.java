public class L32_MethodOverloading {

    static void mo(){
        System.out.println("Good Morning");
    }
    static void mo(int a){
        System.out.println("LOVE YOU " + a);
    }
    static void mo(int a, int b){
        System.out.println("HII " + a);
        System.out.println("Hello " + b);
    }

    
    static void change(int a){
        a = 98;
    }
    static void change2(int [] b){
        b[0] =45;
    }


    static void telljoke(){
        System.out.println("I invented a new word!\nPlagiarism");
    }

    public static void main(String[] args) {
        // telljoke();

    //     // Case 1:- Changing the Integer
    //     int x = 45;
    //     change(x);
    //     System.out.println(x);

    //     // Case 2:- Changing the Array
    //     int [] marks = {34,97,67,98,76,56};
    //     change2(marks);
    //     System.out.println(marks[0]);


        // Methods Overloading
        mo();
        mo(3000);
        mo(10, 100);

    }
}
