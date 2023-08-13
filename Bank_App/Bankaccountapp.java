package Bank_App;

public class Bankaccountapp {
    public static void main(String[] args) {
        checking chkacc1 = new checking("rena","987456321",15000);
        savings saveacc1 = new savings("jonas","987321654",2500);
        saveacc1.showInfo();
        System.out.println("_-_-_-_-_-_-_-_-_-_");
        chkacc1.showInfo();

    }
    
}

