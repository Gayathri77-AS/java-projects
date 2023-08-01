package EmailApp;
import java.util.Scanner;

public class Email {
    private String Firstname;
    private String Lastname;
    private String Password;
    private String Department;
    private String email;
    private int MailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companysuffix = "giya.com";
//constructor first and last name
//department
//random pswd
//mailbox capacity
//alternate email
//change pswd

public Email(String Firstname, String Lastname){
    this.Firstname = Firstname;
    this.Lastname = Lastname;
    
    this.Department = setDepartment();
    
    this.Password = randomPassword(defaultPasswordLength);
    System.out.println("Your Password: "+this.Password);
    email = Firstname.toLowerCase()+"."+Lastname.toLowerCase()+"@"+Department+"."+companysuffix;
    System.out.println("Email Generated: "+this.email);
}

private String setDepartment(){
    System.out.println("Enter the department \n1 for Sales \n2 for development \n3 for accounting \n0 for none \n Enter department code");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    if (depChoice == 1){ return "sales";}
    else if (depChoice == 2){ return "development";}
    else if (depChoice == 3){ return "accounting";}
    else {return "";}
}

private String randomPassword(int length){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    char[] password = new char[length];
    for(int i=0; i < length; i++){
        int rand = (int) (Math.random()*passwordSet.length());
        password[i] = passwordSet.charAt(rand);
    }
    return new String (password);
}

public void setmailboxCapacity(int capacity){
    this.MailboxCapacity = capacity;
}

public void setAlternateEmail(String altEmail){
    this.alternateEmail = altEmail;
}

public void changePassword(String Password) {
    this.Password = Password;
}

public int getmailboxCapacity() {return MailboxCapacity;}
public String getAlternateEmail(){return alternateEmail;}
public String getPassword(){return Password;}


public String showInfo(){
    return "\nDISPLAY NAME : " +Firstname+" "+Lastname +
            "\nCOMPANY EMAIL : " +email +
            "\nMAILBOX CAPACITY : "+MailboxCapacity+ "mb";
}


}
