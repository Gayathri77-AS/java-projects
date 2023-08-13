package Bank_App;

public class account implements IbaseRate{
    
    String name;
    String sSN;
    static int index =10000; 
    
    double balance;
    String accountNumber;
    double rate;
    
    public account(String name,String sSN,double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
         
        index++;
        this.accountNumber = setAccountNumber();
    }
    private String setAccountNumber(){
        String lasttwoofSSN = sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID = index;
        int randno = (int)(Math.random()*Math.pow(10,3));
        return lasttwoofSSN + uniqueID + randno;
    }
    

    public void showInfo(){
        System.out.println(
            "NAME : " + name +
            "\nACCOUNT NUMBER : " + accountNumber +
            "\nBALANCE : " + balance 
            
        );
    }


}
