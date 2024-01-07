public class L27_Arrays{
    public static void main(String[] args) {
        int [] marks = {56,16,96,25,14};
        // float [] marks = {56.5f,16.66f,96.25f,25.25f,14.159f};
        // System.out.println(marks.length);

        // String [] Students = {"Ravi","Harry","Shubham","Lakshya","Jatin","Prince","Yash"};
        // System.out.println(Students.length);
        // System.out.println(Students[6]);

        // Displaying the Array (Naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (For Loop)
        System.out.println("Printing the array using For Loop");
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // Quick Quiz:- Displaying the Array in Reverse order (For Loop)
        System.out.println("Printing the Array using For Loop in Reverse order");
        for(int i = marks.length - 1; i>=0; i--){
            System.out.println(marks[i]);
        }

        // Quick Quiz:- Displaying the Array (For-Each Loop)
        System.out.println("Printing the Array using For Each loop");
        for (int i : marks) {
            System.out.println(i);
        }

    }
}