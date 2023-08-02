package student_DB_App;

import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private int gradeyear;
    private int studentID;
    private String courses;
    private int tutionBalance;
    private int costOfcourse = 600;



    //constructor prompt user to enter students name and year


    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student First name:");
        this.firstname = in.nextLine();
        System.out.println("Enter student Last name:");
        this.lastname = in.nextLine();
        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior \nEnter student Class Level:");
        this.gradeyear = in.nextInt();
        System.out.println(firstname+""+lastname+""+gradeyear);

    }

    //generate an ID

    //enroll in courses

    //view balance

    //pay tuition

    //show status
}
