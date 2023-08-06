package student_DB_App;

import java.util.Scanner;
public class Student {

    private String firstname;
    private String lastname;
    private int gradeyear;
    private String studentID;
    private String courses = null;
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
        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior \nEnter student Class Level:");
        this.gradeyear = in.nextInt();
        in.close();
        setStudentID();
        System.out.println(firstname+""+lastname+" "+gradeyear+" "+studentID);
        enroll();
    }

    //generate an ID

    private String setStudentID(){
        id++;
        return this.studentID = gradeyear + "" + id;
    }

    //enroll in courses
    public void enroll(){
    System.out.println("Enter the department \n1 for Sales \n2 for development \n3 for accounting \n0 for none \n Enter department code");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    System.out.println(depChoice);
    in.close();
    /*if (cou != "Q"){
            courses = courses + "\n" + course;
            tutionBalance = tutionBalance + costOfcourse ;
        }
        System.out.println("Enrolled in " +courses);
        System.out.println("Tution Balance "+tutionBalance);*/
    }
    //view balance
    

    //pay tuition

    //show status
}
