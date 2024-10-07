package august.augex_04082024;

public class BankAccount {
    String BankName;
    int Balance;
    String BankCode;


    BankAccount(){
         BankName = "ICICI";
         Balance = 10000000;
         BankCode = "ICICI0002";

    }
    BankAccount(String bName,int bal,String bCode){
        this.BankName = bName;
        this.Balance = bal;
        this.BankCode = bCode;

    }
    BankAccount(String bName,int bal){
        this.BankName = bName;
        this.Balance = bal;


    }

    void PrintDetails(){
        System.out.println("Bank Name is ->" + BankName);
        System.out.println("Balance Name is ->" + Balance);
        System.out.println("Bank Name is ->" + BankCode);
    }
}
