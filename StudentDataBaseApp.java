import java.util.*;

public class StudentDataBaseApp {

    public static void main(String[] args) {

        //ask how many new users to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //create n numbers of new students
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
        System.out.println(students[0].toString());

    }
    
}
