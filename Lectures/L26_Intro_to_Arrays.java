public class L26_Intro_to_Arrays{
    public static void main(String[] args) {
        /* Classroom of 500 Students - You have to store marks of these 500 Students
        You have 2 options :-
        1) Create 500 variables
        2) Use Arrays (recommended)
        */

        // There are Three main ways to create an array in JAVA
        // 1. Declaration and Memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then Memory allocation
        // int [] marks;
        // marks = new int [5];
        // marks[0] = 100;
        // marks[1] = 20;
        // marks[2] = 35;
        // marks[3] = 60;
        // marks[4] = 56;

        //3. Declaration, Memory Allocation and initialization together
        int [] marks = {56,16,96,25,14};
        System.out.println(marks[0]);
    }
}