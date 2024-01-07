public class L33_VarArg {
    // static int sum(int a, int b){
    //     return(a+b);
    // }

    // static int sum(int a, int b, int c){
    //     return(a+b+c);
    // }

    //Instead of creating multiple methods we can create one work for all
    static int sum(int ...arr){
        // Available as int [] arr;
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("WElcome to Lecture 33 --> VarArgs");
        System.out.println("sum of 6 and 4 is " + sum(6, 4));
        System.out.println("sum of 6, 5 and 4 is " + sum(6, 5, 4));
    }
}
