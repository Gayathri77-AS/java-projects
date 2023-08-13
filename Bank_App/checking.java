package Bank_App;

public class checking extends account {

    int debitCardnumber;
    int PIN;
    
    public checking(String name,String sSN,double initDeposit){
        super(name, sSN,initDeposit);
        accountNumber = "2" + accountNumber;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("CHECKING ACCOUNT");
    }
}
