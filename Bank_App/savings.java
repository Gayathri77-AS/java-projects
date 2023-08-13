package Bank_App;

public class savings extends account{
    double safetyDepositboxID;
    int safetyDepositboxKey;



    public savings(String name,String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setsafetyDepositboxID();
    } 

    private void setsafetyDepositboxID(){
        safetyDepositboxID = (int) (Math.random() * Math.pow(10,3));
        System.out.println(safetyDepositboxID);
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("SAVINGS ACCOUNT");
    }
}
