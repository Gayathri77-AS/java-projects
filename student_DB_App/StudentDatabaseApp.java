package student_DB_App;
import java.io.IOException;
public class StudentDatabaseApp {
    /**
     * @param args
     */
    public static void main(String[] args)throws IOException{
        Student st1 = new Student();
        st1.enroll();
        st1.payTution(500);
        System.out.println(st1.toString());
    }
}
