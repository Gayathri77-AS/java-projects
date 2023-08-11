package Bank_App;

public class checking extends account {
    
    public checking(String name){
        super(name);
        System.out.println("new checking account");
        System.out.println("Name:"+name);
    }
}
