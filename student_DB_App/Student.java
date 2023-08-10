package student_DB_App;

import java.util.Scanner;
public class Student {
    private String firstname;
    private String lastname;
    private int gradeyear;
    private String studentID;
    private String courses = "";
    private int tutionBalance = 0;
    private int costOfcourse = 600;
    private static int id = 1000;
    
    //constructor prompt user to enter students name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student First name:");
        this.firstname = in.nextLine();

        System.out.println("Enter student Last name:");
        this.lastname = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior \nEnter Student Class Level:");
        this.gradeyear = in.nextInt();

        in.close();

        setStudentID();

        System.out.println(firstname+""+lastname+" "+gradeyear+" "+studentID);
        
    }
    //generate an ID
    private String setStudentID(){
        id++;
        return this.studentID = gradeyear + "" + id;
    }
    //enroll in courses
    public void enroll(){
    do{
        System.out.print("Enetr course to enroll (Q to quit):");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        in.close();
        if (course != "Q") {
            courses = courses  + "\n" +course;
            tutionBalance = tutionBalance + costOfcourse;
        }
        else{
            System.out.println("BREAK");
            break;
        }
    }while( 1 != 0 );

    System.out.println("ENROLLED IN "+ courses);
    System.out.println("TUTION BALANCE "+tutionBalance);
    }

    public void viewBalance(){
        System.out.println("Your balance is $"+tutionBalance);
    }
    public void payTution(int payment){
        viewBalance();
        System.out.println("enter your payment:$");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance-payment;
        System.out.println("Thank you for your payment of $ "+payment);
        viewBalance();
    }

    public String toString(){
        return "name" +firstname+""+lastname+
        "\nCourses Enrolled" +courses+
        "\nBalance: $"+tutionBalance;
    }

}
    //view balance
    //pay tuition
    //show status

