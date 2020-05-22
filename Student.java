import java.util.*;

public class Student {
    private  String fName;
    private  String lName;
    private  String gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //constructor : prompts user to eneter student name and year
    public Student(){
        final Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.fName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lName = in.nextLine();

        System.out.print("1. Freshmen \n2. Sophmore \n3. Junior \n4. Senior \nEnter student class level: ");
        this.gradeYear = in.nextLine();

        setStudentID();
        // System.out.println(fName + " " + lName + gradeYear + " " + studentID);

        id++;
    }
    // generate id
    private void setStudentID(){
        //grade level + id
        id++;
        this.studentID = gradeYear + "" + id;

    }

    //enroll in courses
    public void enroll(){
        //get inside a  loop, user hits Q
        do {
            System.out.print("enter course to enroll (0 to quit): ");
            final Scanner in = new Scanner(System.in);
            final String course = in.nextLine();
            if (!course.equals("Q")) {
            courses = courses + "\n" + course;
            tuitionBalance += costOfCourse;
            }
             else  {break;} 
    } while (1 != 0);

        // System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALENCE: " + tuitionBalance);
    }

    // view balance  
    public void veiwBalance(){
        System.out.println("Your balance is: $ " + tuitionBalance);
    }

    //pay tuition
    public void payTuition(){
        System.out.println("Enter your payment: $ ");
         Scanner in = new Scanner(System.in);
         int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        veiwBalance();
    }

    //show status
    public String toString(){
        return "Name: " + fName + " " + lName + 
        "/nGrade Level: " + gradeYear + 
        "\nStudent ID: " + studentID +
        "\n Courses enrolled: " + courses + 
        "\nBalance: $ " + tuitionBalance;
    }

}

