public class L34_FibonacciNumber {
    public static void main(String args[]){
        
        // Without Recursion
        int n1=0, n2=1, count=15;
        System.out.println("The Fibonacci sequence example is:");
        
        System.out.format("%d %d",n1,n2);
        for(int i=2; i<count; ++i){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

        //With Recursion
        
    }
}
