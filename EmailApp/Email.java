package EmailApp;

import java.util.Scanner;


public class Email {
    private String Firstname;
    private String Lastname;
    private String Password;
    private String Department;
    private int MailboxCapacity;
    private String alternateEmail;
//constructor first and last name
//department
//random pswd
//mailbox capacity
//alternate email
//change pswd

public Email(String Firstname, String Lastname){
    this.Firstname = Firstname;
    this.Lastname = Lastname;
    System.out.println("Email created "+this.Firstname+""+this.Lastname);

    this.Department = setDepartment();
}

private String setDepartment(){
    System.out.println("Enter the department \n1 for Sales \n2 for development \n3 for accounting \n 0 for none");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    if (depChoice == 1){ return "sales";}
    else if (depChoice == 2){ return "development";}
    else if (depChoice == 3){ return "accounting";}
    else {return "";}
}


}
