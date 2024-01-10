import java.util.Scanner;

public class L29_PracticeSet6{
    public static void main(String[] args) {
        
        // Question 1 --> Create an Float Array and find the Sum
        // float [] marks = {24.66f, 56.67f,65.32f,23.65f,32.50f};
        // float sum = 0;
        // for(int i = 0; i<marks.length; i++){
        //     sum += marks[i];
        // }
        // System.out.println(sum);


        // Question 2 --> find whether a given integer present in array or not
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = sc.nextInt();
        // int [] num = {32,56,45,85,94,14,25,34,56};
        // boolean isArray = false;
        // for(float element:num){
        //     if(n == element){
        //         isArray = true;
        //         break;
        //     }
        // }
        // if(isArray){
        //     System.out.println("Number is present in the array");
        // }
        // else{
        //     System.out.println("Number is not present");
        // }


        // Question 3 --> calculate Avg. Marks from an Array
        // float [] physics = {34.32f,78.98f,98,90.67f,45.5f};
        // float sum = 0;
        // for (int i = 0; i<physics.length; i++) {
        //     sum += physics[i];
        // }
        // float avg = sum/(physics.length);
        // System.out.println(avg);


        // Question 4 --> Create a program to add 2 matrix of size 2*3
        // int [][] m1 = {{2,3,5},
        //                {9,5,3}};

        // int [][] m2 = {{2,3,6},
        //                {9,5,5}};

        // int [][] result = {{0,0,0},
        //                    {0,0,0}};

        // for(int i = 0; i<m1.length;i++){ //row no. of times
        //     for(int j = 0; j<m1[i].length;j++){ // column no. of times
        //         // System.out.format("Setting the values \ni = %d\nj = %d\n", i,j);
        //         result[i][j] = m1[i][j] + m2[i][j];
        //         System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println("");
        // }


        // Question 5 --> Reverse an Array
        // int [] a = {6,3,2,5,65,3,25,15,25};
        // int l = a.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;
        // for(int i = 0; i<=n;i++){
        //     // Swap a[i] and a[l-1-i]
        //     // a   b   temp
        //     //|3| |4|  ||
            
        //     temp = a[i];
        //     a[i] = a[l-1-i];
        //     a[l-1-i] = temp;
        // }
        // for (int element : a) {
        //     System.out.print(element + " ");
        // }


        // Question 6 --> Find the maximum element of the Array
        // int [] a = {6,3,2,5,65,3,25,15,25};
        // // int max = 0;
        // int max = Integer.MIN_VALUE; //Run of -ve Integers 
        // for (int e : a) {
        //     if(e>max){
        //         max = e;
        //     }
        // }
        // System.out.println("The Maximum element of this Array is " + max);

        /* *Imp Note*-
         Integer.MIN_VALUE = -2147483648 --> Minimum Value Stored by an Integer in JAVA
         Integer.MAX_VALUE = 2147483647 --> Maximum value stored by an Integer in JAVA
        */


        // Question 7 --> Find the minimum element of the Array
        // int [] a = {565,365262,3,54,6213,5,32,5,323,445,56541,9465,454,26456,4656,6746,632,5621};
        // int min = Integer.MAX_VALUE;
        // for (int element : a) {
        //     if(element<min){
        //         min = element;
        //     }
        // }
        // System.out.println("The Maximum element of this Array is " + min);


        //Question 8 --> Check whether an Array is Sorted or Not
        // boolean isSorted = true;
        // int [] arr = {11,15,56,116,};
        // for(int i = 0; i<arr.length-1; i++){
        //     if(arr[i] > arr[i+1]){
        //         isSorted = false;
        //         break;
        //     }
        // }
        // if(isSorted){
        //     System.out.println("Array is Sorted");
        // }
        // else{
        //     System.out.println("Array is not Sorted");
        // }
        
    }
}